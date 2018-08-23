package com.home.java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.Employee;

public class StreamsMapping {
	
	static List<Employee> employeeList =
		     Arrays.asList(new Employee("Tom Jones", 45), 
		       new Employee("Harry Major", 25),
		       new Employee("Ethan Hardy", 65),
		       new Employee("Nancy Smith", 15),
		       new Employee("Deborah Sprightly", 29));
	
	public static void main1(String args[]) {
		  List<String> mappedList = employeeList.stream().
		                     map(emp -> emp.getName()).
		                     collect(Collectors.toList());
		  mappedList.forEach(System.out::println);
	    }		
	
	public static void main(String args[]) {
		
		/* Stream<String[]> s = employeeList.stream().map(emp-> emp.getName().split(""));
		 Stream<String> st =   s.flatMap(array->Arrays.stream(array));
		 List<String>  ls= st.map(str -> str.toUpperCase()).collect(Collectors.toList());
		 ls.forEach(System.out::print);*/
		 
		  List<String> nameCharList = employeeList.stream()
		           .map(emp-> emp.getName().split(""))
		           .flatMap(array->Arrays.stream(array))
		           .map(str -> str.toUpperCase()) 
		           .filter(str -> !(str.equals(" ")))
		           .collect(Collectors.toList());
		   nameCharList.forEach(str -> System.out.print(str));
		  }
	
	
	

}
