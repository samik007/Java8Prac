package com.samik.java8;

import java.util.HashMap;
import java.util.Map;

public class ForeachJava8 {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<String, Integer>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//items.forEach((k, v) -> System.out.println("Item: " +k + " count: " + v));
		
		items.forEach((k,v) -> {
			System.out.println("Item: " +k + " count: " + v);
			if(("E").equals(k)) {
				System.out.println("Helllo E");
			}
		});
	}
}
