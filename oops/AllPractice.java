package com.oops;

import java.util.Scanner;

abstract class Shape1 {
	float area;
	
	abstract void acceptInput();
	abstract void calculateArea();
	
	void dispArea() {
		System.out.println(area);
	}
}
class Square1 extends Shape1{
	private float side;
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side: ");
		side= scan.nextFloat();
	}
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		area = side *side ;
	}
}

class Rectangle1 extends Shape1 {
	private float length;
	private float width;
	
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = scan.nextFloat();
		System.out.println("Enter the width: ");
		width = scan.nextFloat();
	}
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		area = length * width;
	}
}

class Circle1 extends Shape1 {
	private float radius;
	
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius = scan.nextFloat();
	}
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		area = (float)3.14* radius *radius;
	}
}

class Geometry1 {
	void maths(Shape1 ref) {
		ref.acceptInput();
		ref.calculateArea();
		ref.dispArea();
	}
}
public class AllPractice {
	public static void main(String[] args) {
		Square1 s = new Square1();
		
		Rectangle1 r = new Rectangle1();
	
		Circle1 c = new Circle1();
		
		Geometry1 g = new Geometry1();
		
		g.maths(s);
		g.maths(r);
		g.maths(c);
		
	}
}
