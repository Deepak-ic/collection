package org.col;


import java.util.Map.Entry;
import java.util.TreeMap;

public class Challenge36 {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		for (Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
		}
	}

}
