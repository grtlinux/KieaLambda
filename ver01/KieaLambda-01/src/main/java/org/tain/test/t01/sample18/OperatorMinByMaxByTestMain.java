package org.tain.test.t01.sample18;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByTestMain {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("minBy: " + fruit);
		
		binaryOperator = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.getPrice(), f2.getPrice()));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("maxBy: " + fruit);
	}
}
