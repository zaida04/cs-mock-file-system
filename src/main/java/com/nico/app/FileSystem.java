package com.nico.app;

import java.util.ArrayList;

public class FileSystem {
  public ArrayList<File> files;
  public ArrayList<Directory> dirs;

  public FileSystem(ArrayList<Directory> dirs, ArrayList<File> files) {
    this.dirs = dirs;
    this.files = files;
  }

  public boolean deleteFile(String name) {
    for (int i = 0; i < this.files.size() - 1; i++) {
      File file = this.files.get(i);
      if (file.name == name) {
        this.files.remove(i);
        return true;
      }
    }
    return false;
  }
}
