package com.nico.app;

import java.util.ArrayList;

public class Directory extends Location {
  public ArrayList<File> children;

  public Directory(String name, ArrayList<File> children) {
    super(name);
    this.children = children;
    this.type = LocationType.DIR;
  }
}
