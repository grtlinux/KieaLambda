package org.tain.test.t02.test02;

public class TestMain {

	public static void main(String[] args) {
		MyFunctionInterface fi = null;
		fi = () -> {
			String str = "method call 1";
			System.out.println(">>> " + str);
		};
		fi.method();
		
		fi = () -> { System.out.println(">>> method call 2"); };
		fi.method();
		
		fi = () -> System.out.println(">>> method call 3");
		fi.method();
	}
}
