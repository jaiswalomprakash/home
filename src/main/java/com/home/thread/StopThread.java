package com.home.thread;

public class StopThread extends Thread {
	
	volatile Thread threadStoper;
	
	public void startThread() {
		threadStoper = new Thread(this);
		threadStoper.start();
	}
	
	public void stopThread(){		
		threadStoper = null;
	}
		
	
	@Override
	public void run() {	    
		System.out.println("StopThread.run()-------");
		while(Thread.currentThread()==threadStoper){			
			try {
				System.out.println("thread is running status");
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	public static void main(String[] args) {
		StopThread stopThread = new  StopThread();
		stopThread.startThread();
		
		// call from different class
		stopThread.stopThread();
	}
	

}
