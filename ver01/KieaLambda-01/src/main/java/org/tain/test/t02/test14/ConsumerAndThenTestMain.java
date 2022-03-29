package org.tain.test.t02.test14;

import java.util.function.Consumer;

public class ConsumerAndThenTestMain {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println(">>> consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println(">>> consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerB.andThen(consumerA);
		consumerAB.accept(new Member(123, "홍길동", null));
	}
}
