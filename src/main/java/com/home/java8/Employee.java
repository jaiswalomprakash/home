package com.home.java8;

public class Employee {
	String name;
	int age ;

	public Employee(String string, int i) {
		this.name =string;
		this.age =i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

}
