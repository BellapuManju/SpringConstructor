package com.ciq.bean;

public class Address {
private int aid;
private String aname;
private int pin;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int aid, String aname, int pin) {
	super();
	this.aid = aid;
	this.aname = aname;
	this.pin = pin;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", aname=" + aname + ", pin=" + pin + "]";
}


}
