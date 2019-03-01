package com.home.dpattern.creational.AbstractDp;

import com.home.dpattern.creational.AbstractDp.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFacotory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleInstance(capacity);
	}

	@Override
	public Storage createStorage(int mb) {
		// TODO Auto-generated method stub
		return new GoogleStorage(mb);
	}

}
