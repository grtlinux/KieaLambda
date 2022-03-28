package org.tain.test.t02.test03;

public class TestMain {

	public static void main(String[] args) {
		MyFunctionInterface fi = null;
		
		fi = (x, y) -> {
			int z = x + y;
			System.out.println(">>> " + z);
		};
		fi.method(12, 20);
		
		fi = (x, y) -> { System.out.println(">>> " + (x + y)); };
		fi.method(12, 20);
		
		fi = (x, y) -> System.out.println(">>> " + (x + y));
	}
}
