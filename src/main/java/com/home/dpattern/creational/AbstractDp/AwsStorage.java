package com.home.dpattern.creational.AbstractDp;

public class AwsStorage implements Storage {
	
	public AwsStorage(int storageCapacityInMb) {
		
		System.out.println("AwsStorage.AwsStorage() "+storageCapacityInMb);
	
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "aws storage";
	}
	@Override	
	public String toString() {
	
		return "aws storage";
	}

}
