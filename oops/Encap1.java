package com.oops;


class Student {
	private int id;
	private String name;
	private int num;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
public class Encap1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Narendra");
		s.setNum(591);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getNum());
	}
	
}
