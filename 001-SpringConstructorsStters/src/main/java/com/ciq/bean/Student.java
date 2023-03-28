package com.ciq.bean;

public class Student {

	private int id;
	private String name;
	private double fee;
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double fee, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", address=" + address + "]";
	}

		

}
