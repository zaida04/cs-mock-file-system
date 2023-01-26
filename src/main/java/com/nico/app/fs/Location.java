package com.nico.app.fs;

enum LocationType {
  DIR,
  FILE
}

public class Location {
  public String name;
  public LocationType type;

  public Location(String name) {
    this.name = name;
  }
}
