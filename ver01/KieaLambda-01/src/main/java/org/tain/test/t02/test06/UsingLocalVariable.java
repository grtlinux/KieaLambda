package org.tain.test.t02.test06;

public class UsingLocalVariable {

	private int outterField = 0;
	
	public void mathod(int arg) {  // final int arg
		int localVar = 40;         // final int lodalVar
		
		this.outterField = 10;
		
		
		MyFunctionalInterface fi = () -> {
			System.out.println(">> this.outterField: " + this.outterField);
			//arg = 31;
			//localVar = 41;
			//System.out.println(">> arg: " + arg);
			//System.out.println(">> localVar: " + localVar);
			this.outterField = 110;
			//arg = 120;
			//localVar = 130;
		};
		fi.method();
		
		arg = 120;
		localVar = 130;
		System.out.println(">>> this.outterField: " + this.outterField);
		System.out.println(">>> arg: " + arg);
		System.out.println(">>> localVar: " + localVar);
	}
}
