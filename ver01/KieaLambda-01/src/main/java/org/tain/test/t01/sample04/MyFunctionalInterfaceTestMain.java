package org.tain.test.t01.sample04;

public class MyFunctionalInterfaceTestMain {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.println("result 1: " + fi.method(2, 4));
		
		fi = (x, y) -> { return x * y; };
		System.out.println("result 2: " + fi.method(2, 4));
		
		fi = (x, y) -> x * y;
		System.out.println("result 3: " + fi.method(2, 4));
		
		fi = (x, y) -> sum(x, y);
		System.out.println("result 4: " + fi.method(2, 4));
	}
	
	public static int sum(int x, int y) {
		return x * y;
	}
}
