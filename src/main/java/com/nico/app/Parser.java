package com.nico.app;

import java.util.ArrayList;

class Parser {
	public FileSystem parse(String input) {
		String[] lines = input.split("\n");
		ArrayList<File> files = new ArrayList<File>();
		ArrayList<Directory> dirs = new ArrayList<Directory>();

		for (int i = 0; i < lines.length; i++) {
			String digestibleLine = lines[i].trim();
			try {
				Tuple<LocationType, Integer> resolvedLine = getLocationType(digestibleLine);
				LocationType resolvedType = resolvedLine.first;
				String name = getName(digestibleLine, resolvedLine.second);

				if (resolvedType == LocationType.DIR) {
					ArrayList<File> children = new ArrayList<File>();
					dirs.add(new Directory(name, children));
				} else {
					files.add(new File(name));
				}
			} catch (Exception e) {
				System.out.println("Improper syntax. " + e.getMessage());
			}
		}

		FileSystem mainFileSystem = new FileSystem(dirs, files);
		return mainFileSystem;
	}

	private String getName(String digestibleLine, int length) {
		Integer typeLength = length;
		return digestibleLine.substring(typeLength);
	}

	private Tuple<LocationType, Integer> getLocationType(String line) throws Exception {
		String precedingFlag = "";
		for (int i = 0; i < line.length() - 1; i++) {
			if (Character.isLetter(line.charAt((i))))
				break;
			precedingFlag += line.charAt(i);
		}

		switch (precedingFlag) {
			case "->": {
				return new Tuple<LocationType, Integer>(LocationType.FILE, 2);
			}
			default: {
				return new Tuple<LocationType, Integer>(LocationType.DIR, 0);
			}
		}
	}
}