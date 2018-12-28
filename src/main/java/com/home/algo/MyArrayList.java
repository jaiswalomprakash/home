package com.home.algo;

import java.util.Arrays;

//http://www.java2novice.com/java-interview-programs/arraylist-implementation/
public class MyArrayList<E> {
	
	public static final int  DEFAULT_CAPACITY =16;
	private int size =0;
	private Object [] element ;
	
	public MyArrayList() {
	     element = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(E obj){
		
		if(size > (element.length -5) ){
			increaseCapacity();
		}
		element[size++] = obj;
	}
	
	public E get(int index) {
		
		if(index>element.length || index < 0){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return (E)element[index];
	}
	
	
	public E remove(int index) {
		
		if(index>element.length || index < 0){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			
			Object oldObject = element[index];
			element[index] = null;
			int temp = index;
			while(temp<size){
				element[temp] = element[temp+1];
				element[temp+1] = null;
				temp++;
			}
			size--;
			 return (E)oldObject;
			
		}
		
	}
	
	public  int size() {
		return size;
	}

	private void increaseCapacity() {
		element = Arrays.copyOf(element,element.length*2);		
	}
	
	
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println("==============size==================="+list.size);
		
		for (int i = 0; i < list.size; i++) {			
			System.out.println(i+" )"+list.get(i));
		}
		list.remove(4);
		
		System.out.println("======after remove  4 th element ========size==================="+list.size);
		
		for (int i = 0; i < list.size; i++) {			
			System.out.println(i+" )"+list.get(i));
		}	
		
	}
	
	
	
	

}
