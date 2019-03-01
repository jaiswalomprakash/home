package com.home.dpattern.creational.AbstractDp;

public class GoogleInstance implements Instance{

	public GoogleInstance(Capacity capacity) {
		// TODO Auto-generated constructor stub
		System.out.println("GoogleInstance.GoogleInstance() "+capacity);
	}
	@Override
	public void start() {
		System.out.println("GoogleInstance.start()");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("GoogleInstance.stop()");
		
	}

	@Override
	public void attchStorage(Storage storage) {
		// TODO Auto-generated method stub
		System.out.println("GoogleInstance.attchStorage()"+storage);
		
	}

	@Override
	public String toString() {
		return "Google Instance";
	}
	
	

}
