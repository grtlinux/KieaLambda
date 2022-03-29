package org.tain.test.t02.test15;

public class Member {

	private int id;
	private String name;
	private Address address;
	
	public Member(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() { return this.id; }
	public String getName() { return this.name; }
	public Address getAddress() { return this.address; }
}
