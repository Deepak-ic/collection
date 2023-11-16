package org.col;

import java.util.TreeMap;

public class Challenge29 {

	public static void main(String[] args) {
		//Key : !, @, #, $, %, ^, &, *, (
		//Values : 10, 20, 30, 40, 50, 60, 10, 50, 40
		TreeMap<String, Integer> m = new TreeMap<String, Integer>();
		m.put("!", 10);
		m.put("@", 20);
		m.put("#", 30);
		m.put("$", 40);
		m.put("%", 50);
		m.put("^", 60);
		m.put("&", 10);
		m.put("*", 50);
		m.put("(", 40);
		for (Integer v : m.values()) {
			System.out.println("Key Values : " + v);
		}
	}

}
