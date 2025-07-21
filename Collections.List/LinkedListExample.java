package com.collections.List;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		
		System.out.println(list);
		
		list.addFirst(50);
		list.addLast(12);
		list.remove(0);
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}
}
