package com.nico.app;

public class File extends Location {
  public File(String name) {
    super(name);
    this.type = LocationType.FILE;
  }
}