package org.tain.test.t02.test04;

public class TestMain {

	public static void main(String[] args) {
		MyFunctionInterface fi = null;
		
		fi = (x, y) -> {
			int z = x + y;
			return z;
		};
		System.out.println(">>> return: " + fi.method(12, 13));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(">>> return: " + fi.method(12, 13));
		
		fi = (x, y) -> x + y;
		System.out.println(">>> return: " + fi.method(12, 13));
	}
}
