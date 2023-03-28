package com.ciq.bean;

public class Employe {
private int id;
private String name;
private double salary;
private String location;
private Address address;


public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void setLocation(String location) {
	this.location = location;
	
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + ", address="
			+ address + "]";
}

}
