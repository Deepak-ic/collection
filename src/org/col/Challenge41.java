package org.col;

import java.util.HashMap;
import java.util.Map.Entry;

public class Challenge41 {

	public static void main(String[] args) {
		//Key : stdId, stdName, stdPhone, address, dob, email, gender
		HashMap<String, String> m = new HashMap<String, String>();
	    m.put("stdId", "42");
        m.put("stdName", "Dhilip");
        m.put("stdPhone", "9876543212");
        m.put("address", "123 Main str, City");
        m.put("dob", "1999-07-20");
        m.put("email", "dhilip@gmail.com");
        m.put("gender", "Male");
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
