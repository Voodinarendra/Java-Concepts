package com.oops;

class Customer {
	private int id;
	private String name;
	private int num;
	
	public Customer(int id,String name,int num) {
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
}
public class Encap2 {
	public static void main(String[] args) {
	Customer c = new Customer(1,"Narendra",591);
	System.out.println(c.getId());
	System.out.println(c.getName());
	System.out.println(c.getNum());
	}
}
