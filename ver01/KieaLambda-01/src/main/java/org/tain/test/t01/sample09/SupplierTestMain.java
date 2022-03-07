package org.tain.test.t01.sample09;

import java.util.function.IntSupplier;

public class SupplierTestMain {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println("num: " + intSupplier.getAsInt());
	}
}
