package com.nico.app;

import java.util.ArrayList;

public class Util {
  public static void printDirs(ArrayList<Directory> dirs) {
    for (Directory dir : dirs) {
      System.out.println("Directory: " + dir.name);
    }
  }

  public static void printFiles(ArrayList<File> files) {
    for (File file : files) {
      System.out.println("File: " + file.name);
    }
  }
}
