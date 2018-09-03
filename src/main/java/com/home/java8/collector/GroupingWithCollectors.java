package com.home.java8.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupingWithCollectors {
	 static List<Employee> employeeList = Arrays.asList(
		      new Employee("Tom Jones", 45, 12000.00,Department.MARKETING),
		      new Employee("Harry Major", 26, 20000.00, Department.LEGAL),
		      new Employee("Ethan Hardy", 65, 30000.00, Department.LEGAL),
		      new Employee("Nancy Smith", 22, 15000.00, Department.MARKETING),
		      new Employee("Catherine Jones", 21, 18000.00, Department.HR),
		      new Employee("James Elliot", 58, 24000.00, Department.OPERATIONS),
		      new Employee("Frank Anthony", 55, 32000.00, Department.MARKETING),
		      new Employee("Michael Reeves", 40, 45000.00, Department.OPERATIONS));
	 	     //public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier)
/*			 Where,
		     – input is classifier which is an instance of a Function functional interface which converts from type T to type K.
		     – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘K, List<T>’*/
	 		public static void main1(String[] args) {		 		
		 	  Map<Department, List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 	   System.out.println("Employees grouped by department");
		 	  employeeMap.forEach((Department key,List<Employee> list)->System.out.println(key+" -> "+list));		 
	 		}
	 		//Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream)
	 		/*Where,
	 	     – 1st input parameter is classifier which is an instance of a Function functional interface which converts from type T to type K.
	 	     – 2nd input parameter is downstream collector which collects the grouped elements into type D, where D is the specified finisher.
	 	     – output is a Collector with finisher(return type) as a Map with entries having ‘key,value’ pairs as ‘K, D’*/
	 		public static void main(String[] args) {
	 			Map<Department,Set<Employee>> employeeMap
	 		    = employeeList.stream()
	 		      .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
	 		  System.out.println("Employees grouped by department");
	 		  employeeMap.forEach((Department key, Set<Employee> empSet) -> System.out.println(key +" -> "+empSet));
				
			}
	 		
	 		//Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream)

	 		/*Where,
	 		     – 1st input parameter is classifier which is an instance of a Function functional interface which converts from type T to type K.
	 		     – 2nd input parameter is Supplier<M> which is a factory supplying Maps of type M.
	 		     – 3rd input parameter is downstream collector which collects the grouped elements into type D, where D is the specified finisher.*/
	 
	 
	 		public static void main3(String[] args) {
	 			Map<Department,Set<Employee>> employeeMap
	 		    = employeeList.stream()
	 		      .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toSet()));
	 		  System.out.println("Employees grouped by department");
	 		  employeeMap.forEach((Department key, Set<Employee> empSet) -> System.out.println(key +" -> "+empSet));
				
			}
	 

}
