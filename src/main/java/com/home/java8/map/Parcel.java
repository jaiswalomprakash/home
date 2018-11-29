package com.home.java8.map;

import java.util.Arrays;
import java.util.List;

public class Parcel {
	  String name;
	  List<String> items;

	  public Parcel(String name, String... items) {
	    this.name = name;
	    this.items = Arrays.asList(items);
	  }

	  public List<String> getItems() {
	    return items;
	  }
	  
	  
}
