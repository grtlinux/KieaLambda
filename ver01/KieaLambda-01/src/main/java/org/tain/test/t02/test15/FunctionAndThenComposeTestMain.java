package org.tain.test.t02.test15;

import java.util.function.Function;

public class FunctionAndThenComposeTestMain {

	public static void main(String[] args) {
		Function<Member,Address> functionA;
		Function<Address,String> functionB;
		Function<Member,String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member(123, "홍길동", new Address("대한민국", "서울")));
		System.out.println(">>> 거주도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member(123, "홍길동", new Address("대한민국", "서울")));
		System.out.println(">>> 거주도시: " + city);
		
	}
}
