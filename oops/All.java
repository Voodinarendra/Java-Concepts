package com.oops;

import java.util.Scanner;
abstract class Shape {
	
	float area;
	
	abstract void acceptInput();
	abstract void calculate();
	
	void dis() {
		System.out.println(area);
	}
}
class Square extends Shape{
	private float side;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		side = sc.nextFloat();
	}
	@Override
	void calculate() {
		area = side * side;
	}
}
class Rectangle extends Shape {
	private float length;
	private float width;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextFloat();
		System.out.println("Enter the width: ");
		width = sc.nextFloat();
	}
	@Override
	void calculate() {
		area = length * width;
	}
}
class Circle extends Shape {
	private float radius;
	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius = sc.nextFloat();
	}
	@Override
	void calculate() {
		area = (float)3.14*radius*radius;
	}
}
class Geometry {
	void maths(Shape ref) {
		ref.acceptInput();
		ref.calculate();
		ref.dis();
	}
}
public class All {
	public static void main(String[] args) {
		Square s = new Square();
		
		Rectangle r = new Rectangle();
		
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		
		g.maths(s);
		g.maths(r);
		g.maths(c);
	}
}
