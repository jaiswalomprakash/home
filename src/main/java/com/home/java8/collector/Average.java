package com.home.java8.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.home.java8.Stream.Employee;

public class Average {
	
	static List<Employee> employeeList
    = Arrays.asList(new com.home.java8.Stream.Employee("Tom Jones", 45, 15000.00),
    new Employee("Tom Jones", 45, 7000.00),
    new Employee("Ethan Hardy", 65, 8000.00),
    new Employee("Nancy Smith", 22, 10000.00),
    new Employee("Deborah Sprightly", 29, 9000.00));
	
	
	/**
	 *  public static <T> Collector<T, ?, Double> averagingInt(ToIntFunction<? super T> mapper)
		public static <T> Collector<T, ?, Double> averagingLong(ToLongFunction<? super T> mapper)
		public static <T> Collector<T, ?, Double> averagingDouble(ToDoubleFunction<? super T> mapper)

			Where,
	     – input for all 3 collectors is a Function which extracts an int/long/double type of value as it works on the objects of the stream.The definitions in fact use the predefined ToIntFunction/ ToLongFunction/ ToDoubleFunction which I will explain in the next section.
	     – output is a Collector with finisher(return type) of type Double.
		 * @param args
	 */
	public static void main(String[] args) {		
		Double avgDoubleSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)); 
		Double avgIntSalary = employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
		Double avgLongSalary = employeeList.stream().collect(Collectors.averagingLong(Employee::getAge));		
		System.out.printf(" averagingDouble = %f,  averagingInt= %f,  averagingLong=%f",avgDoubleSalary,avgIntSalary,avgLongSalary);
		
	}

}
