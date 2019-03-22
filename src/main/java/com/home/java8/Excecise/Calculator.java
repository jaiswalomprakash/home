package com.home.java8.Excecise;
import java.util.Arrays;
//https://stackoverflow.com/questions/23361418/lambdas-in-the-classical-operation-enum-example
import java.util.function.DoubleBinaryOperator;

public enum Calculator implements DoubleBinaryOperator {
	PLUS    ("+", (l, r) -> l + r),
    MINUS   ("-", (l, r) -> l - r),
    MULTIPLY("*", (l, r) -> l * r),
    DIVIDE  ("/", (l, r) -> l / r);

    private final String symbol;
    private final DoubleBinaryOperator binaryOperator;

    private Calculator(final String symbol, final DoubleBinaryOperator binaryOperator) {
        this.symbol = symbol;
        this.binaryOperator = binaryOperator;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public double applyAsDouble(final double left, final double right) {
        return binaryOperator.applyAsDouble(left, right);
    }
	
	
	 public static void main(String[] args) {
		 Arrays.stream(Calculator.values())
	        .forEach(op -> System.out.println("Performing operation " + op.getSymbol() + " on 2 and 4: " + op.applyAsDouble(2, 4)));
		
	}
}
