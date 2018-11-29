package com.home.java8.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.Employee;

public class ComparatorNullsFirst {
	
	  static List<Employee> employeeList = 
		      Arrays.asList(new Employee("Tom Jones", 45), 
		        new Employee("Harry Major", 35),
		        new Employee("Harry Major", 25), 
		        new Employee("Ethan Hardy", 65), 
		        new Employee("Nancy Smith", 15),
		        new Employee(null, 15),
		        new Employee("Deborah Sprightly", 29));
	  
	  public static void main(String[] args) {	
	    Comparator<Employee> employeeObj1 = Comparator.comparing(Employee::getName,Comparator.nullsFirst((e1,e2)->e1.compareTo(e2)));
		Comparator<Employee> nullsFirst = Comparator.comparing(Employee::getName,Comparator.nullsFirst(String::compareTo));
		Comparator<Employee> nullsLast = Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo));
		Collections.sort(employeeList, nullsFirst);
		  employeeList.forEach(System.out::println);		  
		  Collections.sort(employeeList, nullsLast);
		  employeeList.forEach(System.out::println);
		  
		  
	}
	 
	
	  

}
