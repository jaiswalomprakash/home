package com.home.dpattern.creational.AbstractDp;

public interface Instance {
	
	enum Capacity {mini, micro,larg}
	
	void start();
	void stop();
	void attchStorage(Storage storage);
	

}
