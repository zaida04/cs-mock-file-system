package com.nico.app;

public class Main {
	public static void main(String[] args) {
		String startingInput = """
					dir1
					->file.txt
					->file2.txt
					->file3.txt
					dir2
					dir3
					->file4.txt
				""";

		Parser parser = new Parser();
		FileSystem filesAndDirs = parser.parse(startingInput);
		Util.printDirs(filesAndDirs.dirs);
		Util.printFiles(filesAndDirs.files);
	}
}
