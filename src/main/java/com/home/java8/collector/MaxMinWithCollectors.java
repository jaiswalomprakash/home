package com.home.java8.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.home.java8.Stream.Employee;



public class MaxMinWithCollectors {
	
	// public static <T> Collector<T, ?, Optional<T>> maxBy(Comparator<? super T> comparator)			
	// public static <T> Collector<T, ?, Optional<T>> minBy(Comparator<? super T> comparator)
	
	static List<Employee> employeeList    = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
      new Employee("Tom Jones", 45, 7000.00),
      new Employee("Ethan Hardy", 65, 8000.00),
      new Employee("Nancy Smith", 22, 10000.00),
      new Employee("Deborah Sprightly", 29, 9000.00));
	
	  public static void main(String[] args) {
		//Optional<Employee>  maxEmployee1 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(emp->emp.getAge())));  
		Optional<Employee>  maxEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));		
		System.out.println(maxEmployee.isPresent()?maxEmployee.get():"Not Applicable");		
		Optional<Employee> minEmployee = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));		
		System.out.println(minEmployee.isPresent()?minEmployee.get():"Not Applicable");		  
	}

}
