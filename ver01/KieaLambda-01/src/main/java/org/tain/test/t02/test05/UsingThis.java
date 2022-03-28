package org.tain.test.t02.test05;

public class UsingThis {

	private int outterField = 10;
	
	class Inner {
		private int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				UsingThis.this.outterField = 30;
				System.out.println("UsingThis.this.outterField: " + UsingThis.this.outterField);
				
				System.out.println("innerField: " + innerField);
				this.innerField = 40;
				System.out.println("this.innerField: " + this.innerField);
			};
			fi.method();
			System.out.println(">> innerField: " + this.innerField);
		}
	}
	
	public void method( ) {
		System.out.println(">> outterField: " + this.outterField);
	}
}
