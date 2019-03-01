package com.home.dpattern.creational.AbstractDp;

import com.home.dpattern.creational.AbstractDp.Instance.Capacity;

public interface ResourceFacotory {
	
	Instance createInstance(Capacity capacity);
	Storage createStorage(int mb);
	

}
