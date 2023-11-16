package org.col;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Challenge34 {

	public static void main(String[] args) {
		//Key : Sam, Karthik, Gowtham, Gokul, Neethu
		//Values : Selenium, framework, oracle, corejava, jira
		Hashtable<String, String> m = new Hashtable<>();
		m.put("Sam", "Selenium");
		m.put("Karthik", "framework");
		m.put("Gowtham", "oracle");
		m.put("Gokul", "corejava");
		m.put("Neethu", "jira");
		while (m.isEmpty() == false) {
			for (Entry<String, String> entry : m.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				System.out.println("keys   : " + key);
				System.out.println("Values : " + val);
			}break;
		}
	}

}
