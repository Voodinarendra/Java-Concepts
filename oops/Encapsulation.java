package com.oops;

class AC {
	private String coolant;
	
	public void setData(String x) {
		coolant = x;
	}
	public String getData() {
		return coolant;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		 AC a= new AC();
		 a.setData("Liquid");
		 System.out.println(a.getData());
	}
}
