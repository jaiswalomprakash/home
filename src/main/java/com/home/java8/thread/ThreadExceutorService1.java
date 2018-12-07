package com.home.java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import scala.collection.parallel.ParIterableLike.Forall;

public class ThreadExceutorService1 {
	public static void main(String[] args) {
		
		System.out.println("ThreadExceutorService1.main()"+Runtime.getRuntime().availableProcessors());
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for(int i=0;i<100;i++) {
			executorService.execute(new Task());
		}
		
	}
	
	
	

}
