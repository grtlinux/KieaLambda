package org.tain.test.t02.test18;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByTestMain {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		
		binaryOperator = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
		System.out.println(">>> minBy: " + binaryOperator.apply(new Fruit("apple", 1000), new Fruit("orange", 1200)));
		
		binaryOperator = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
		System.out.println(">>> maxBy: " + binaryOperator.apply(new Fruit("apple", 1000), new Fruit("orange", 1200)));
	}
}
