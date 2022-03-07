package org.tain.test.t01.sample19;

import java.util.function.IntBinaryOperator;

public class MethodReferencesTestMain {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("result1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("result2: " + operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("result3: " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("result4: " + operator.applyAsInt(7, 8));
	}
}
