package org.col;

import java.util.LinkedHashMap;

public class Challenge32 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		m.put(10, 10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		while (m != null) {
			for (Integer key : m.keySet()) {
				System.out.println("keys   : " + key);
			}
			for (Integer val : m.values()) {
				System.out.println("Values : " + val);
			}break;
		}
	}

}
