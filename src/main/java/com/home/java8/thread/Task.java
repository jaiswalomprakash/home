package com.home.java8.thread;

public class Task implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Task.run()"+ Thread.currentThread().getName());
		
		
	}

}
