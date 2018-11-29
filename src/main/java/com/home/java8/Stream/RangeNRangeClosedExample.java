package com.home.java8.Stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeNRangeClosedExample {
	
	public static void main(String args[]){
	    //IntStream.range() and IntStream.rangeClosed() examples
	    System.out.println("Using IntStream.range() & IntStream.rangeClosed()");
	    IntStream.range(1, 10).forEach(i -> System.out.print(i + " "));
	    System.out.println();
	    IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));
	     
	    //LongStream.range() and LongStream.rangeClosed() examples    
	    System.out.println("\n Using LongStream.range() & LongStream.rangeClosed()");
	    LongStream.range(1000000L, 1000005L).forEach(i -> System.out.print(i + " "));
	    System.out.println();
	    LongStream.rangeClosed(1000000L, 1000005L).forEach(i -> System.out.print(i + " "));
	  }

}
