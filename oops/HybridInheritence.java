package com.oops;

class Vehicle {
	void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Vehicles having Wheels.........");
	}
}
class Car extends Vehicle {
	void moves() {
		// TODO Auto-generated method stub
		System.out.println("Car ready to move");
	}
}
class Suzuki extends Car {
	 void disp() {
		// TODO Auto-generated method stub
		 System.out.println("Suzuki moves Smoothly.........");
	}
}
class Skoda extends Car {
	void rus() {
		// TODO Auto-generated method stub
		System.out.println("Skoda moves Rush......");
	}
}
public class HybridInheritence {
	public static void main(String[] args) {
		Suzuki su = new Suzuki();
		su.wheels();
		su.moves();		
		su.disp();
		
		System.out.println("-------------------");
		
		Skoda sk = new Skoda();
		sk.wheels();
		sk.moves();	
		sk.rus();
	}
}
