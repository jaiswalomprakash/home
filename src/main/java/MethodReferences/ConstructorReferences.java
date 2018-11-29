package MethodReferences;

import com.home.java8.Employee;

public class ConstructorReferences {
	
	
	public static void main(String[] args) {
		
		// EmployeeFactory empFactory1 = (s,i)-> new Employee(s,i);
		
		EmployeeFactory empFactory = Employee:: new; 
		Employee emp = empFactory.getEmploy("om", 32);
		System.out.println("ConstructorReferences -----"+emp);
		
		
	}

}
