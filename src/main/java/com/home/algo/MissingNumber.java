package com.home.algo;

public class MissingNumber {
	static int position =0;
	static boolean flag = false;
	static int count =1;
	public static void main(String[] args) {
		int a [] = {1,2,3,4,6,7,8,10};		
		printMissingNumber(a,position);
		
	}
    
	 public static void printMissingNumber(int a[] ,int position){
			if(position ==a.length-1){
			 return;
			}
			for(;position<a[a.length-1];position++){
				if(position != (a[position]-count)){
					System.out.println("Missing Number : "+(position+count));
					count++;
					flag = true;
					break;
				 }

			}
			
			if(flag){
				printMissingNumber(a,position);
			}

		}

}
