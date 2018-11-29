package com.home.java8.collector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningWithCollectors {
	public static void main1(String[] args) {
		//public static Collector<CharSequence, ?, String> joining()
		String joinedStr = Stream.iterate(new Integer(0),(Integer n)->n+1)
				.limit(5)
				.map(n->n.toString())
				.collect(Collectors.joining());
		
		System.out.println("Joined String: "+joinedStr);		
	}
	//public static Collector<CharSequence, ?, String> joining(CharSequence delimiter)
	public static void main2(String[] args) {
		String joinedStr = Stream.iterate(new Integer(0), (Integer n)->n+1)
				.limit(5)
				.map(n->n.toString())
				.collect(Collectors.joining("-"));
		
		System.out.println("Joined String: with delimeter (-) "+joinedStr);		
	}
	//Joining Collector which adds a delimiter between elements, and suffix & prefix to joined String
	//public static Collector<CharSequence, ?, String> joiningjoining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
	public static void main(String[] args) {
		String joinedStrPrefixSufix = Stream.iterate(new Integer(0), (Integer n)->n+1)
				.limit(5)
				.map(n->n.toString())
				.collect(Collectors.joining(",","{","}"));
		System.out.println("Joined String: with delimeter (-s & p) "+joinedStrPrefixSufix);		
		
		
	}
	

}
