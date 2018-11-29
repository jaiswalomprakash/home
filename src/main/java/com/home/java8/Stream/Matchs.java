package com.home.java8.Stream;

import java.util.Arrays;
import java.util.List;

import com.home.java8.Employee;

public class Matchs {
	
	 static List<Employee> employeeList = 
		      Arrays.asList(new Employee("Tom Jones", 45), 
		        new Employee("Harry Major", 35),
		        new Employee("Harry Major", 25), 
		        new Employee("Ethan Hardy", 65), 
		        new Employee("Nancy Smith", 15),
		        new Employee(null, 15),
		        new Employee("Deborah Sprightly", 29));	 
	 
	 public static void main(String[] args) {		 
		 boolean empAbove40 = employeeList.stream()
                 .anyMatch(emp -> emp.getAge() > 40);
		 System.out.println("Any employee is above 40:" + empAbove40);		 
		
	 }

}
