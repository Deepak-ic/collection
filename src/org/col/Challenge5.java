package org.col;

import java.util.HashSet;

public class Challenge5 {
	public static void main(String[] args) {
		HashSet<Integer> l = new HashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		System.out.println("LinkedHashSet Values : " + l);
	}
}
