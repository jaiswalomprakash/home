package com.home.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTRExample2 {
	
	public static void main(String[] args) {
		
		 List<Employee> employeeList=
			      Arrays.asList(new Employee("Tom Jones", 45), 
			       new Employee("Harry Major", 25),
			       new Employee("Ethan Hardy", 65),
			       new Employee("Nancy Smith", 15),
			       new Employee("Deborah Sprightly", 29));
		
		Function<Employee,String> empToString = e->e.getName();		
		Function<String,String> intialFunc = str->str.substring(0, 1);	
		List<String> empString  = convertEmpToStirng(employeeList,empToString.andThen(intialFunc));
		empString.stream().forEach(System.out::println);

	}

	private static List<String> convertEmpToStirng(List<Employee> employeeList,
			Function<Employee, String> empToString) {	
			List<String> elist=new ArrayList<String>(); 	
		     for(Employee e : employeeList ){
		    	 elist.add(empToString.apply(e));
		     }
		return elist;
	}

}
