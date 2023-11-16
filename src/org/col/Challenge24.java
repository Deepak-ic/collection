package org.col;

import java.util.LinkedHashMap;

public class Challenge24 {

	public static void main(String[] args) {
		//Key : 10, 20, 30, 40, 50, 60, 10, 50, 40
		//Values : 10, 20, 30, 40, 50, 60, 10, 50, 40
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
		for (Integer k : m.keySet()) {
			System.out.println("Print Key Values : " + k);
		}
	}

}
