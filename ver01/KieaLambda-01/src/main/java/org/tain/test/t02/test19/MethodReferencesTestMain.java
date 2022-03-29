package org.tain.test.t02.test19;

import java.util.function.IntBinaryOperator;

public class MethodReferencesTestMain {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println(">>> Calculator.staticMethod(x, y): " + operator.applyAsInt(4, 5));
		
		operator = Calculator::staticMethod;
		System.out.println(">>> Calculator::staticMethod: " + operator.applyAsInt(4, 5));
		
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println(">>> obj.instanceMethod(x, y): " + operator.applyAsInt(4, 5));
		
		operator = obj::instanceMethod;
		System.out.println(">>> obj::instanceMethod: " + operator.applyAsInt(4, 5));
	}
}
