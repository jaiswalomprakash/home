package com.home.algo;

import java.util.LinkedList;

public class StringToNumber {

    public static void main(String[] args) {
		System.out.println("StringToNumber.main() "+convertStringToNumber("12345"));
	
	}

	public static int convertStringToNumber(String str){
		
		int ascii = (int)'0';
		System.out.println(ascii);
		
		char [] a = str.toCharArray();
		int sum =0;
		for(char c: a) {
			System.out.println((int)c-ascii);
			//sum *= 10;			
			sum= (sum*10)+ ((int)c-ascii);
			System.out.println("sum "+sum);
			
		}
		
		return sum;
	}

}
