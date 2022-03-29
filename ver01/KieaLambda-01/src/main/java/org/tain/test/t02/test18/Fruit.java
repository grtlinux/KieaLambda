package org.tain.test.t02.test18;

public class Fruit {

	private String name;
	private int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	
	public String toString() {
		return String.format("[Fruit:%s,%d]", this.name, this.price);
	}
}
