package com.home.dpattern.creational.AbstractDp;

import com.home.dpattern.creational.AbstractDp.Instance.Capacity;

public class AwsResourceFactory implements ResourceFacotory {

	@Override
	public Instance createInstance(Capacity capacity) {
		// TODO Auto-generated method stub
		return new AwsInstance(capacity);
	}

	@Override
	public Storage createStorage(int mb) {
		// TODO Auto-generated method stub
		return new AwsStorage(mb);
	}

}
