package com.nico.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.nico.app.fs.Directory;
import com.nico.app.fs.File;

public class Util {
  public static void printDirs(ArrayList<Directory> dirs) {
    for (Directory dir : dirs) {
      System.out.println(dir.name + "/");
    }
  }

  public static void printFiles(ArrayList<File> files) {
    for (File file : files) {
      System.out.println(file.name);
    }
  }

  public static void choice(int num, String value) {
    System.out.println("(" + num + ") " + value);
  }

  public static String askString(String question, Scanner main) {
    System.out.print(question);
    String res = main.nextLine();
    return res;
  }

  public static int askNum(String question, Scanner main) {
    System.out.print(question);
    int res = main.nextInt();
    main.nextLine();
    return res;
  }
}
