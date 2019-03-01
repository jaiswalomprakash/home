package com.home.algo;

public class Node<T> implements Comparable<T> {
	T value;
	Node<T> nextRef;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	@Override
	public int compareTo(T o) {
	    if(o==this.value)
	    	return 0;
	    else 
		return 1;
	}

	}
