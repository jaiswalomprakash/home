package com.home.java8.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.Employee;

public class ComparatorsInJava8 {
	
	  static List<Employee> employeeList = 
		      Arrays.asList(new Employee("Tom Jones", 45), 
		        new Employee("Harry Major", 35),
		        new Employee("Harry Major", 25), 
		        new Employee("Ethan Hardy", 65), 
		        new Employee("Nancy Smith", 15),
		        new Employee("Deborah Sprightly", 29));
	  
	  public static void main1(String[] args) {
		  Comparator<Employee> comparatorObj = (e1,e2)->e1.getName().compareTo(e2.getName());
		  Collections.sort(employeeList,comparatorObj);		  
		  employeeList.stream().forEach(e->System.out.println(e.getName()));
	 }
	  
	  public static void main2(String[] args) {
		  Comparator<Employee> comparatorObj=Comparator.comparing((Employee emp) -> emp.getName());		  
		  Collections.sort(employeeList,comparatorObj);		  
		  employeeList.stream().forEach(e->System.out.println(e.getName()));
	 }
	  
	  public static void main3(String[] args) {
		  Comparator<Employee> comparatorObj=Comparator.comparing(Employee::getName);		  
		  Collections.sort(employeeList,comparatorObj);		  
		  employeeList.stream().forEach(e->System.out.println(e.getName()));
	 }
	  
	  
	  public static void main4(String[] args) {
		  Comparator<Employee> comppratorObj = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		  Collections.sort(employeeList,comppratorObj);
		  employeeList.forEach(System.out::println);
		  
	 }
	  public static void main(String[] args) {
		  List<String> empNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		  empNames.sort(Comparator.naturalOrder());
		  empNames.forEach(System.out::println);
		  
	 }
	

}
