package com.home.homeproject.cache;
//https://explainjava.com/simple-in-memory-cache-java/
public interface Cache {
	
	 public void add(String key,Object value, long periodInMillis);
	 
	 public Object get(String key);
	 
	 public void remove(String key);
	 
	 void clear();
	 
	 long size();
	 
	 void print();

}
