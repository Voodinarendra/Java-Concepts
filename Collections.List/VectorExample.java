package com.collections.List;

import java.util.Collections;
import java.util.Vector;

public class VectorExample {
		public static void main(String[] args) {
			Vector<String> list  = new Vector<>();
			list.add("Apple");
			list.add("Banana");
			list.add("Banana");
			list.add(1, "Cherry");
			
			System.out.println(list);
			
			Collections.sort(list);
			//Collections.reverse(list);
			//Collections.shuffle(list);
			
			System.out.println(list);
			list.add("Car");
			System.out.println("Element at index 1: " + list.get(1));

			for(String item : list) {
				System.out.println(item);
			}
			System.out.println("Size of Vector: " +list.size());
			
		
		}
	}
