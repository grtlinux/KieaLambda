package org.tain.test.t02.test16;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateTestMain {

	public static void main(String[] args) {
		IntPredicate predicate2 = a -> a%2 == 0;
		IntPredicate predicate3 = a -> a%3 == 0;
		
		IntPredicate predicate23;
		
		predicate23 = predicate2.and(predicate3);
		System.out.println(">>> and(): " + predicate23.test(9));
		
		predicate23 = predicate2.or(predicate3);
		System.out.println(">>> or(): " + predicate23.test(9));
		
		predicate23 = predicate2.negate();
		System.out.println(">>> negate(): " + predicate23.test(9));
	}
}
