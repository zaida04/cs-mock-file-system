package com.nico.app;

import java.util.Scanner;

import com.nico.app.fs.FileSystem;
import com.nico.app.fs.Parser;

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
		FileSystem fs = parser.parse(startingInput);
		Scanner io = new Scanner(System.in);
		mwhile: while (true) {
			Util.printDirs(fs.dirs);
			Util.printFiles(fs.files);

			System.out.println("C:/your-name/fs");
			Util.choice(0, "Exit");
			Util.choice(1, "Add a file");
			Util.choice(2, "Delete a file");
			Util.choice(3, "Add a directory");
			Util.choice(4, "Delete a directory");

			int choice = Util.askNum("What would you like to do?\n", io);
			switch (choice) {
				case 0: {
					System.out.println("Exiting...");
					break mwhile;
				}
				case 1: {
					String filename = Util.askString("Give name of file to add: ", io);
					fs.addFile(filename);
					System.out.println("Added file " + filename);
					break;
				}
				case 2: {
					String filename = Util.askString("Give name of file to remove: ", io);
					Boolean res = fs.deleteFile(filename);
					if (res) {
						System.out.println("Deleted file " + filename);
					} else {
						System.out.println("File does not exist.");
					}
					break;
				}
				case 3: {
					String dirname = Util.askString("Give name of directory to add: ", io);
					fs.addDir(dirname);
					System.out.println("Added dir " + dirname);
					break;
				}
				case 4: {
					String dirname = Util.askString("Give name of directory to delete: ", io);
					Boolean res = fs.deleteDir(dirname);
					if (res) {
						System.out.println("Deleted dir " + dirname);
					} else {
						System.out.println("File does not exist.");
					}
					break;
				}
				default: {
					System.out.print("Invalid choice.");
				}
			}
		}
	}
}
