package com.home.java8.collector;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.home.java8.Stream.Employee;

public class CollectingAndThenExample {
	
	 static List<Employee> employeeList
     = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
     new Employee("Tom Jones", 45, 7000.00),
     new Employee("Ethan Hardy", 65, 8000.00),
     new Employee("Nancy Smith", 22, 10000.00),
     new Employee("Deborah Sprightly", 29, 9000.00));
	 
	 public static void main1(String[] args) {
		/* public static<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)

		 Where,
		      – 1st input parameter is downstream which is an instance of a Collector<T,A,R> i.e. the standard definition of a collector. In other words, any collector can be used here.
		      – 2nd input parameter is finisher which needs to be an instance of a Function<R,RR> functional interface. This function instance takes as input an object of type R which is the output from downstream collector, and it returns an output of type RR which is the final return type of collectingAndThen collector as well.
		      – output is a Collector with finisher(return type) of type RR.*/
		// String maxSalaryEmp = employeeList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),(Optional<Employee> emp)->emp.isPresent()? emp.get().getName() : "none"));
		 String maxageEmp = employeeList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getAge)),( Optional<Employee> emp )->emp.isPresent()? emp.get().getName():""));
		 System.out.println("Max salaried employee's name: "+ maxageEmp);
	}
	 
	 
	 public static void main(String[] args) {
			/* public static<T,A,R,RR> Collector<T,A,RR> collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)

			 Where,
			      – 1st input parameter is downstream which is an instance of a Collector<T,A,R> i.e. the standard definition of a collector. In other words, any collector can be used here.
			      – 2nd input parameter is finisher which needs to be an instance of a Function<R,RR> functional interface. This function instance takes as input an object of type R which is the output from downstream collector, and it returns an output of type RR which is the final return type of collectingAndThen collector as well.
			      – output is a Collector with finisher(return type) of type RR.*/
			// String maxSalaryEmp = employeeList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),(Optional<Employee> emp)->emp.isPresent()? emp.get().getName() : "none"));
			 String avgsal = employeeList.stream().collect(Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary), avgSalary->new DecimalFormat().format(new DecimalFormat("'$'0.00").format(avgSalary))));
			 String avgSalary = employeeList.stream().collect(Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary), averageSalary -> new DecimalFormat().format(averageSalary)));
			 System.out.println("Max salaried employee's name: "+ avgsal);
		}
}
