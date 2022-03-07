package org.tain.test.t01.sample16;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateTestMain {

	public static void main(String[] args) {
		IntPredicate predicate2 = a -> a%2 == 0;
		IntPredicate predicate3 = a -> a%3 == 0;
		
		IntPredicate predicate23;
		boolean result;
		
		predicate23 = predicate2.and(predicate3);
		result = predicate23.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		predicate23 = predicate2.or(predicate3);
		result = predicate23.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);
		
		predicate23 = predicate2.negate();
		result = predicate23.test(9);
		System.out.println("9는 홀수 입니까? " + result);
	}
}
