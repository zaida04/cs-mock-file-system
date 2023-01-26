package com.nico.app.fs;

import java.util.ArrayList;

public class Directory extends Location {
  public ArrayList<File> children;

  public Directory(String name) {
    super(name);
    this.children = new ArrayList<File>();
    this.type = LocationType.DIR;
  }

  public Directory(String name, ArrayList<File> children) {
    super(name);
    this.children = children;
    this.type = LocationType.DIR;
  }
}
