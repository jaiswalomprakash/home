package com.home.java8.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.Employee;

public class CountingWithCollectors {
	//public static <T> Collector<T, ?, Long> counting()
	 static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 22),
		      new Employee("Deborah Sprightly", 29));
	 
	 public static void main(String[] args) {
	  long count =	employeeList.stream().collect(Collectors.counting());
	  System.out.println("Employee count: "+count);
		 
		 
	}

}
