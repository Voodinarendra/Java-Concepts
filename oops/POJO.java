package com.oops;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private float height;
	private String address;
	
	public Employee() {
		
	}
	public Employee(int id,String name,float height,String address) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getHeight() {
		return height;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
 }

public class POJO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Objects you want: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Employee Details: "+i);
			System.out.println("Enter the Employee Id: ");
			int a = sc.nextInt();
			System.out.println("Enter the Employee Name: ");
			String b = sc.next();
			System.out.println("Enter the Employee Height: ");
			float c = sc.nextFloat();
			System.out.println("Enter the Employee Address: ");
			String d = sc.next();	
		}
	}
}
