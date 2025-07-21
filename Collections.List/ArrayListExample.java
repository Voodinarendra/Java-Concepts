package com.collections.List;

import java.util.ArrayList;

import java.util.Collections;


public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Banana");
		list.add(1, "Cherry");
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		Collections.sort(list);
		//Collections.reverse(list);
		//Collections.shuffle(list);
		
		list.add("Car");
		

		for(String item : list) {
			System.out.println(item);
		}
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		System.out.println(l1);
		
		for(int i=0;i<l1.size();i++) {
			Integer a = (Integer)l1.get(i);
			if(a%2==0) {
				System.out.println(a);
			}
		
		}
	}
}
