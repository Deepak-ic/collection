package org.col;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Challenge37 {

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
		while (m.isEmpty() == false) {
			for (Entry<Integer, Integer> entry : m.entrySet()) {
				Integer key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println("Keys and Values : " + key + " " + val);
			}break;
		}
	}

}
