package com.home.algo;

public class SortArray {
	
	public static void main(String[] args) {		
		int [] a = {1,4,2,5,6,3};
		a = sortArray(a);
		for(int ar:a){
			System.out.print(ar+" ");			
		}
	}
	
	public static int [] sortArray(int [] a){		
		for (int i = 0; i < a.length; i++) {
			 int temp;
			 for (int j = i+1; j < a.length; j++) {
				 temp = a[i];
				 if(a[i]>a[j]){
					 a[i] =a[j];
					 a[j] =temp;
				 }
				
			}
		}
		
		
		return a;
	}

}
