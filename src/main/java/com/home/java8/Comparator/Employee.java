package com.home.java8.Comparator;
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
	  public boolean equals(Object obj) {
	     if (obj == this) {
	       return true;
	     }
	     if (!(obj instanceof Employee)) {
	       return false;
	     }
	     Employee empObj = (Employee) obj;
	       return this.age==empObj.age
	         && this.name.equalsIgnoreCase(empObj.name);
	  }
	  @Override
	  public int hashCode() {
	    int hash = 1;
	    hash = hash * 17 + this.name.hashCode();
	    hash = hash * 31 + this.age;
	    return hash;
	  }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

}
