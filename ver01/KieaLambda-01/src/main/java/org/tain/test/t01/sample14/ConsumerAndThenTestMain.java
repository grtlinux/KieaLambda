package org.tain.test.t01.sample14;

import java.util.function.Consumer;

public class ConsumerAndThenTestMain {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("hong", "홍길동", null));
	}
}
