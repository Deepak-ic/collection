package org.col;

import java.util.Hashtable;

public class Challenge22 {

	public static void main(String[] args) {
		//Key : Sam, Karthik, Gowtham, Gokul, Neethu
		//Values : Selenium, framework, oracle, corejava, jira
		Hashtable<String, String> m = new Hashtable<>();
		m.put("Sam", "Selenium");
		m.put("Karthik", "framework");
		m.put("Gowtham", "oracle");
		m.put("Gokul", "corejava");
		m.put("Neethu", "jira");
		System.out.println("HashTable Values : " + m);
		
		
	}

}
