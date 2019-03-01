package com.home.dpattern.creational.AbstractDp;

import com.home.dpattern.creational.AbstractDp.Instance.Capacity;

public class Client {

	private ResourceFacotory factory;
	
	public Client(ResourceFacotory resourceFacotory) {
		// TODO Auto-generated constructor stub
		this.factory = resourceFacotory;
	}
	
	public Instance createServer(Instance.Capacity capacity, int mb){
		   Instance instance = factory.createInstance(capacity);
		   Storage storage = factory.createStorage(mb);
		   instance.attchStorage(storage);
		   return instance;
		
	}
	
	public static void main(String[] args) {
		Client client = new Client(new AwsResourceFactory());
		Instance i1 = client.createServer(Capacity.micro,1024*4);
		i1.start();
		i1.stop();
		System.out.println("----------------------");
		client = new Client(new GoogleResourceFactory());
		 i1 = client.createServer(Capacity.larg,1024*5);
		i1.start();
		i1.stop();
	}
	
}
