package org.tain.test.t02.test05;

public class TestMain {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		
		inner.method();
		
		usingThis.method();
	}
}
