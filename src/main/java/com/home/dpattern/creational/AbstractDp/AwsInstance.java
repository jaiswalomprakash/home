package com.home.dpattern.creational.AbstractDp;

public class AwsInstance implements Instance {

	public AwsInstance(Capacity capacity) {
		System.out.println("AwsInstance.AwsInstance()");
	}
	
	@Override
	public void start() {
		System.out.println("AwsInstance.start()");

	}

	@Override
	public void stop() {
		System.out.println("AwsInstance.stop()");
	}

	@Override
	public void attchStorage(Storage storage) {
		// TODO Auto-generated method stub
		System.out.println("AwsInstance.attchStorage()"+storage);

	}
	
	@Override
	public String toString() {
		return "Aws Instance";
	}

}
