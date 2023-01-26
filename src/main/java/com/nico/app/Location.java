package com.nico.app;

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
