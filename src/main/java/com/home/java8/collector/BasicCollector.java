package com.home.java8.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.home.java8.Employee;

public class BasicCollector {
	//Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate)
	  static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
		      new Employee("Harry Major", 25),
		      new Employee("Ethan Hardy", 65),
		      new Employee("Nancy Smith", 22),
		      new Employee("Deborah Sprightly", 29));
		 
		  public static void main1(String args[]){
		    Map<Boolean,List<Employee>> employeeMap = 
		      employeeList.stream()
		                  .collect(Collectors.partitioningBy((Employee emp) -> emp.getAge() > 30));
		    System.out.println("Employees partitioned based on age");
		    employeeMap.forEach((Boolean key, List<Employee> empList) -> System.out.println(key +"->" + empList));
		  }
		//Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T, A, D> downstream)
		  public static void main(String[] args) {
			  Map<Boolean,Long> employeeMapCount =
					     employeeList.stream()
					         .collect(Collectors.partitioningBy(
					             (Employee emp) -> (emp.getAge() > 30),
					             Collectors.counting()
					         ));
					 System.out.println("Employee count in the 2 partitioned age groups");
					 employeeMapCount.forEach((Boolean key,Long count) -> System.out.println(key +" count -> "+ count));
		}
		  
}
