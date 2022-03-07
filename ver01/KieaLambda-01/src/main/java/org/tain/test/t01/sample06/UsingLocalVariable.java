package org.tain.test.t01.sample06;

public class UsingLocalVariable {

	public int outterField = 0;
	
	void method(int arg) {  // arg has final var
		int localVar = 40;  // localVar has final var
		
		this.outterField = 10;
		
		//arg = 31;
		//localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("outterField: " + this.outterField);
			System.out.println("arg: " + arg);
			System.out.println("locaalVar: " + localVar);
		};
		fi.method();
	}
}
