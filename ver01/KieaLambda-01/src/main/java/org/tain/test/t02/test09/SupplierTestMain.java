package org.tain.test.t02.test09;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTestMain {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello, world !!!";
		System.out.println(">>> supplier: " + supplier.get());
		
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		System.out.println(">>> intSupplier: " + intSupplier.getAsInt());
	}
}
