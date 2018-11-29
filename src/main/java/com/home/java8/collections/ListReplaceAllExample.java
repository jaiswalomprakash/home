package com.home.java8.collections;

import java.util.Arrays;
import java.util.List;

import com.home.java8.Stream.Employee;

public class ListReplaceAllExample {
	
	static List<Employee> employeeList = Arrays.asList(
		      new Employee("Tom Jones", 45, 7000.00),
		      new Employee("Harry Major", 25, 10000.00),
		      new Employee("Ethan Hardy", 65, 8000.00),
		      new Employee("Nancy Smith", 22, 12000.00),
		      new Employee("Deborah Sprightly", 29, 9000.00));
		  public static void main(String[] args) {
		    employeeList.replaceAll(employee -> {
		      employee.setSalary(employee.getSalary() * 1.1);
		      return employee;
		    });
		    System.out.println("Employee list with all salaries incremented by 10%");
		    employeeList.forEach(System.out::println);
		  }

}
