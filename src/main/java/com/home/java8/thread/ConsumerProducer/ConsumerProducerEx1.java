package com.home.java8.thread.ConsumerProducer;

import java.util.LinkedList;

public class ConsumerProducerEx1 {
	
	LinkedList<Integer> list = null;
	private static final Integer intialCapacity =2 ;
	
	public ConsumerProducerEx1(){
		list = new LinkedList<>();
	}
	
	
	public void Produce() throws InterruptedException{
		int value =0;
		while(true){
		 synchronized(this){	
			 if(list.size()==intialCapacity){ 
				 list.wait();
			 }else{
				 System.out.println(" Produce Value --"+value);
				 list.add(value++);
				 list.notify();
			 }
			
			 Thread.sleep(1000);
		 }
			
		}
	}
	
	public void Consume() throws InterruptedException {		
		while(true){			
			synchronized(this) {
				if(list.size()==0){
					list.wait();			
					
					
				}else{
					int val = list.removeFirst();
					System.out.println("ConsumerProducerEx1.Consume()--"+val);
				}
				Thread.sleep(1000);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {				
		ConsumerProducerEx1 ex = new ConsumerProducerEx1();
		
		Thread produceTh = new Thread(()->{			
			try {
				ex.Produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		Thread consumeTh = new Thread(()->{			
			try {
				ex.Consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
		produceTh.start();
		consumeTh.start();
		
	}
	
	

}
