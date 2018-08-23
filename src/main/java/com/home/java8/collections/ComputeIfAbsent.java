package com.home.java8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.home.java8.Stream.Employee;

import javassist.expr.NewArray;

public class ComputeIfAbsent {
	static Map<Integer, List<Employee>> employeeDOJMap = new HashMap<>();
	   
	  public static void main(String args[]) {
	 
		  System.out.println("\nJava 7 way of adding a new key(2017) in a multi-value map\n");

		  List empList2017 = employeeDOJMap.get(2017);
		  if (empList2017 == null) {
		    empList2017 = new ArrayList<>();
		  }
		  empList2017.add(new Employee("Tom Newman", 45, 12000.00));
		  employeeDOJMap.put(2017, empList2017);

		  employeeDOJMap.forEach((year,empList)-> System.out.println(year+"-->"+empList));
		  System.out.println("\nUsing Map.computeIfAbsent() to add a new key(2018) in a multi-value map\n");
		 
		  employeeDOJMap.computeIfAbsent(2018, empList-> new ArrayList<>()).add(new Employee("Dick Newman", 35, 10000.00));
		  
	    System.out.println("\nCAPITALIZED Employee Names using Map.replaceAll()");
	    employeeDOJMap.forEach((year,empList)->System.out.println(year+"-->" +empList));
	    
	    
	    employeeDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));
	    System.out.println("\nUsing Map.computeIfPresent() to remove a key(2018) for which no entry exists\n");

	    employeeDOJMap.computeIfPresent(2018, (year, empList) -> empList.removeIf(employee -> employee.getName().equals("Dick Newman")) && empList.size() == 0 ? null : empList);

	    employeeDOJMap.forEach((year, empList)-> System.out.println(year+"-->"+empList));
	    
	    
	    System.out.println("\nAvoiding a null return when fetching a non-existent key's entry using Map.getOrDefault() method\n");
	    List<Employee> empList2019 = employeeDOJMap.getOrDefault(2019, new ArrayList<>());
	    System.out.println("Size of empList 2019 = " + empList2019.size());
	    
	    
	  }

}
