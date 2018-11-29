package com.home.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToString {
	
	public static void main(String[] args) {
		
		List<String> list = java.util.Arrays.asList("om","prakash", "Jaiswal");
		Stream<String> str = list.stream();		
		String [] a = str.toArray(size-> new String[size]);		
		System.out.println(Arrays.toString(a));
		
	}

}
