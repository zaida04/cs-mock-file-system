package com.nico.app.fs;

import java.util.ArrayList;

public class FileSystem {
  public ArrayList<File> files;
  public ArrayList<Directory> dirs;

  public FileSystem(ArrayList<Directory> dirs, ArrayList<File> files) {
    this.dirs = dirs;
    this.files = files;
  }

  public boolean deleteFile(String name) {
    for (int i = 0; i < this.files.size(); i++) {
      File file = this.files.get(i);
      if (file.name.equals(name)) {
        this.files.remove(i);
        return true;
      }
    }
    return false;
  }

  public boolean deleteDir(String name) {
    for (int i = 0; i < this.dirs.size(); i++) {
      Directory dir = this.dirs.get(i);
      if (dir.name.equals(name)) {
        this.dirs.remove(i);
        return true;
      }
    }
    return false;
  }

  public void addDir(String dir) {
    this.dirs.add(new Directory("name"));
  }

  public void addFile(String name) {
    this.files.add(new File(name));
  }
}
