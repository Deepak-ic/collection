package org.col;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Challenge9 {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(100);
		l.add(300);
		l.add(500);
		System.out.println("List Values : " + l);
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(l);
		System.out.println("Set Values : " + s);
	}

}
