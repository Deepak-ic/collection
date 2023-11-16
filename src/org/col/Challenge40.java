package org.col;

import java.util.HashMap;
import java.util.Map.Entry;

public class Challenge40 {

	public static void main(String[] args) {
		//Key : empId, name, phone, address, dob, doj, email, gender, Sql
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("empId", "22");
        m.put("name", "Dhilip");
        m.put("phone", "9876543212");
        m.put("address", "123 Main St, City");
        m.put("dob", "1990-01-15");
        m.put("doj", "2023-07-10");
        m.put("email", "Dhilip@gmailcom");
        m.put("gender", "Male");
        m.put("Sql", "Employee SQL Data");
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
