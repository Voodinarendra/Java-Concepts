package com.oops;

class Studen {
	private int id;
	private String name;
	private int num;
	
	public Studen(int id,String name,int num){
		this.id= id;
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
public class EncapStudent {
	public static void main(String[] args) {
		Studen s1 = new Studen(10,"Kalyan",4268);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getNum());
		
	}
}
