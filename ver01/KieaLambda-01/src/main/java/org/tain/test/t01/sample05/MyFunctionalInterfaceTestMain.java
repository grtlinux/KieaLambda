package org.tain.test.t01.sample05;

public class MyFunctionalInterfaceTestMain {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}
