package com.nico.app.fs;

public class File extends Location {
  public File(String name) {
    super(name);
    this.type = LocationType.FILE;
  }
}