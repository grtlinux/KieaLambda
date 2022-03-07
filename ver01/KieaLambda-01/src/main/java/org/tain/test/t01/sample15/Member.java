package org.tain.test.t01.sample15;

public class Member {

	private String id;
	private String name;
	private Address address;
	
	public Member(String id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String getId() { return this.id; }
	public String getName() { return this.name; }
	public Address getAddress() { return this.address; }
}
