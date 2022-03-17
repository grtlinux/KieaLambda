package org.tain.test.t01.sample21;

public class Member {

	private String name;
	private String id;
	
	public Member() {
		System.out.println("execute Member()");
	}
	
	public Member(String id) {
		System.out.println("execute Member(id)");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("execute Member(name, id)");
		this.name = name;
		this.id = id;
	}
	
	public String getName() { return this.name; }
	public String getId() { return this.id; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(this.name);
		sb.append(":");
		sb.append(this.id);
		sb.append("]");
		return sb.toString();
	}
}
