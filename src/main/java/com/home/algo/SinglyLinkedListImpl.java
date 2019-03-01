package com.home.algo;
//http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
public class SinglyLinkedListImpl<T> {
	
	Node<T> head;
	Node<T> tail;
	
	public void add(T element){
		
		Node<T> nd = new Node<>();
		nd.setValue(element);
		
		// add in first element
		if(head==null){		
			head = nd;
			tail = nd;
		}else{			
			tail.setNextRef(nd);
			tail = nd;
		}
		
	}
	
	
	public void addAfter(T element,T after){
		
		Node temp = head;
		
		
		
		
		
		
	}
	

}
