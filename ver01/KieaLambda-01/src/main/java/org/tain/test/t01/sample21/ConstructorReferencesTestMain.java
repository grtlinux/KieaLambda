package org.tain.test.t01.sample21;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesTestMain {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("angel");
		System.out.println(">>> member1: " + member1);
		
		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("천사", "angel");
		System.out.println(">>> member2: " + member2);
	}
}
