package com.home.java8.collections;

import java.util.Arrays;
import java.util.List;

import com.home.java8.Stream.Employee;

public class ListSortExample {

	 static List<Employee> employeeList = Arrays.asList(
		      new Employee("Tom Jones", 45, 7000.00),
		      new Employee("Harry Major", 25, 10000.00),
		      new Employee("Ethan Hardy", 65, 8000.00),
		      new Employee("Nancy Smith", 22, 12000.00),
		      new Employee("Deborah Sprightly", 29, 9000.00));
		  public static void main(String[] args) {
		    employeeList.sort((emp1, emp2)-> 
		                      Double.compare(emp1.getSalary(),emp2.getSalary()));
		    System.out.println("Employee list sorted by their salaries");
		    employeeList.forEach(System.out::println);
		  }
	
}
