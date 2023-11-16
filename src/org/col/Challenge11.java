package org.col;

import java.util.TreeSet;

public class Challenge11 {

	public static void main(String[] args) {
		TreeSet<Integer> l = new TreeSet<Integer>();
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
		System.out.println("TreeSet Values : " + l);
		while (l != null) {
			for (Integer i : l) {
			System.out.println(i);
			
			}break;
		}
	}

}
