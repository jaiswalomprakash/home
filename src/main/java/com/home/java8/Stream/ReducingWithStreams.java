package com.home.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingWithStreams {
	static List<Employee> employeeList = Arrays.asList(
		      new Employee("Tom Jones", 45, 7000.00),
		      new Employee("Harry Major", 25, 10000.00),
		      new Employee("Ethan Hardy", 65, 8000.00),
		      new Employee("Nancy Smith", 22, 12000.00),
		      new Employee("Deborah Sprightly", 29, 9000.00));
	//Example 1: Finding aggregate of stream elements using Stream.reduce() method	 
	public static void main1(String[] args) {
		 Double totalSalaryExpense = employeeList.stream()
                 .map(emp -> emp.getSalary())
                 .reduce(0.00,(a,b) -> a+b);
		
		 System.out.println("Total salary expense: "+totalSalaryExpense);
		
	}
	//Example 2: Using Stream.reduce() method for finding employee with maximum salary
	public static void main(String[] args) {
		Optional<Employee> maxSalaryEmp=employeeList.stream()
		    .reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b:a);
		if(maxSalaryEmp.isPresent())
		  System.out.println("Employee with max salary: "+maxSalaryEmp.get());
		}
	
	
}
