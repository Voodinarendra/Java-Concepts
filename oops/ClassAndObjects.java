package com.oops;

class Bike {
	String name;
	int num;
	String brand;
	
	void start() {
		System.out.println("Bike is Started......");
	}
	void move() {
		System.out.println("Bike is Moving........");
	}
	void stop() {
		System.out.println("Bike is Stopped.......");
	}
}

public class ClassAndObjects {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.name="Hero Honda";
		b1.num=5432;
		b1.brand="JetPack";
		
		b1.start();
		b1.move();
		b1.stop();
	}
}
