package com.home.algo;

public class ReverseNumber {
	
	public static void main(String[] args) {
		System.out.println("ReverseNumber.main()"+ reverseNumber(12398));
		
	}
	
	public static int reverseNumber(int a){		
		int re=0;	
		while(a>0){
			re= re*10+(a%10);
			a = a/10;
			//System.out.println("ReverseNumber.reverseNumber()"+a);
			
		}
		
		return re;
		
		
	}

}
