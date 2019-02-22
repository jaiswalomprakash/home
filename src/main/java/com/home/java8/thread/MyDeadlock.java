package com.home.java8.thread;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import lombok.Synchronized;

public class MyDeadlock {
	
	String str1 = "java";
	String str2 = "c++";
	
	
	Thread t1 = new Thread(()->{		
		while(true){
			synchronized(str1){
				synchronized(str2){
					System.out.println(str1 + str2);
				}
			}
		}
	 });
	
	Thread t2 = new Thread(()->{		
		while(true){
			synchronized(str2){
				synchronized(str1){
					System.out.println(str2 + str1);
				}
			}
		}
	 });
	
	public static void main(String[] args) {
		MyDeadlock md = new MyDeadlock();
		md.t1.start();
		md.t2.start();
	}
	

}
