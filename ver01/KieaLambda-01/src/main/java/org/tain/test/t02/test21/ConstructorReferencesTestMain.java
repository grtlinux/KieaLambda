package org.tain.test.t02.test21;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesTestMain {

	public static void main(String[] args) {
		Supplier<Member> supplier = Member::new;
		System.out.println(">>> " + supplier.get());
		
		Function<String,Member> function1 = Member::new;
		System.out.println(">>> " + function1.apply("amgel"));
		
		BiFunction<String,String,Member> function2 = Member::new;
		System.out.println(">>> " + function2.apply("천사", "amgel"));
	}
}
