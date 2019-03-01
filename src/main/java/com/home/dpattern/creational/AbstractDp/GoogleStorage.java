package com.home.dpattern.creational.AbstractDp;

public class GoogleStorage implements Storage {

	 public GoogleStorage(int capInMB) {
		 
	  System.out.println("GoogleStorage.GoogleStorage "+capInMB); 
	 }
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "goo";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Google Storage";
	}

}
