package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class StaticMethod {
	
	public static void main(String[] args) {
		// case 1 Reference to a static method 
		
		// through lambda expression		
		Function<String, Double> strDouble = s-> Double.parseDouble(s);		
		System.out.println(" through lambda expression --"+strDouble.apply("5.5"));
		
		// through static reference
		
		
		Function<String, Double> strDoubleRe =Double::parseDouble;
		System.out.println("through static reference "+strDoubleRe.apply("5.5"));
		
		// case 2 Reference to an instance method of a particular object –
		Consumer<String> stringPrinter=System.out::println;
		Consumer<String> stringPrinterLambda=(String s) -> System.out.println(s);
		stringPrinter.accept("Print from method reference based instance");
		stringPrinterLambda.accept("Print from instance created from Lambda");
		
		
		// case 3 Reference to an instance method of an arbitrary object of a particular type
		
		List<Integer > numberList = Arrays.asList(1,2,3,4);
		
		BiPredicate<List<Integer>, Integer> checkContains = (List<Integer> intList, Integer contain )->intList.contains(contain);
		System.out.println("----through lambda ---"+checkContains.test(numberList, 2));
		
		
		BiPredicate<List<Integer>, Integer> checkContainsRef = List :: contains;
		System.out.println("----through method reference ---"+checkContainsRef.test(numberList, 2));
	}	

}
