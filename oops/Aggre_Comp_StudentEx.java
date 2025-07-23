package com.oops;

class Address {
	private int D_no;
	private String Street;
	
	public Address(int D_no,String Street) {
		this.D_no = D_no;
		this.Street = Street;
	}
	public int getD_no() {
		return D_no;
	}
	public String getStreet() {
		return Street;
	}
}
class StudentApp {
	private String name;
	private int rollno;
	
	public StudentApp(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
}
class Student1 {
	StudentApp st = new StudentApp("Raj",12);
	
	public void hasA(Address a) {
		System.out.println(a.getD_no());
		System.out.println(a.getStreet());
	}
}
public class Aggre_Comp_StudentEx {
	public static void main(String[] args) {
		Student1 s = new Student1();
		Address a = new Address(342,"BGLR");
		System.out.println(s.st.getName());
		System.out.println(s.st.getRollno());
		s.hasA(a);
	}
}
