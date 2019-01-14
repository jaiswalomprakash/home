package com.home.coreJava;

import scala.collection.immutable.Map.Map1;

public class Overloading_methodPramotion {
	
public void m1(int a) {
	System.out.println("int version");
}

public void m1(double a) {
	System.out.println("double version");
}

  public static void main(String[] args) {
	  Overloading_methodPramotion t1 = new Overloading_methodPramotion();
	  t1.m1('a');
	  t1.m1(23.50f);
	  
  }
}
