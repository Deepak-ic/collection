package org.col;

import java.util.HashMap;
import java.util.Map.Entry;

public class Challenge31 {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		for (Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key    : " + key);
			System.out.println("Values : " + val);
		}
	}

}
