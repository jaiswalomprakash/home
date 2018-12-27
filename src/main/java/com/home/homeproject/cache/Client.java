package com.home.homeproject.cache;

import org.joda.time.LocalDateTime;

//https://explainjava.com/simple-in-memory-cache-java/
public class Client {
	Cache cache  = new InMemoryCache();
	public static void main(String[] args) throws InterruptedException {
		Client client =	new Client();
		client.addcache();
		for (int i = 0; i < 10; i++) {
			Thread.sleep( 1*60000);
			client.print();
		}
		

		
	}
	
	 void addcache() {
		 for(int i =1;i<=6;i++) {
			 cache.add("test"+i, "Om"+i,( i*60000));
			}
		 cache.print();
	}

	
	public void print() {
		System.out.println("print at "+ new LocalDateTime());
		cache.print();
		
		
	}
	
}
