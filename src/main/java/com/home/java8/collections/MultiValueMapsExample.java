package com.home.java8.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.home.java8.Stream.Employee;

public class MultiValueMapsExample {
	static Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();
	   
	  public static void main(String args[]) {
	 
	    List<Employee> list2014 = Arrays.asList(
	        new Employee("Deborah Sprightly", 29, 9000.00));
	    employeeDOJMap.put(2014, list2014);
	    List<Employee> list2015 = Arrays.asList(
	        new Employee("Tom Jones", 45, 7000.00),
	        new Employee("Harry Major", 25, 10000.00));
	    employeeDOJMap.put(2015, list2015);
	    List<Employee> list2016 = Arrays.asList(
	        new Employee("Ethan Hardy", 65, 8000.00),
	        new Employee("Nancy Smith", 22, 12000.00));
	    employeeDOJMap.put(2016, list2016);
	    System.out.println("Using Map.forEach to print the Employee in employeeDOJMap multi-value map\n");
	    employeeDOJMap.forEach((year,empList)->System.out.println((year+"-->" +empList)));	    
	    employeeDOJMap.replaceAll((year,empList)->
	    {
	    	empList.replaceAll(emp->{
	    		 emp.setName(emp.getName().toUpperCase());
	    		
	    		return emp;
	    	});
	    	  return empList;
	    });	     
	    System.out.println("\nCAPITALIZED Employee Names using Map.replaceAll()");
	    employeeDOJMap.forEach((year,empList)->System.out.println(year+"-->" +empList));
	    
	    
	  }

}
