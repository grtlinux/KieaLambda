package org.tain.test.t01.sample15;

import java.util.function.Function;

public class FunctionAndThenComposeTestMain {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (m) -> m.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member("hong", "홍길동", new Address("한국", "서울"))
				);
		System.out.println("거주도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("hong", "홍길동", new Address("한국", "서울"))
				);
		System.out.println("거주도시: " + city);
	}
}
