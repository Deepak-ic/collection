package org.col;

import java.util.LinkedHashSet;

public class Challenge17 {

	public static void main(String[] args) {
		//Input : List = 10, 20, 30, 90, 10, 10, 40, 50
		//Input : List = 10, 20, 60, 50, 40, 70, 80, 90
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(60);
		l2.add(50);
		l2.add(40);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		System.out.println("First Linked Hash Set Values : " + l);
		System.out.println("Second Linked Hash Set Values : " + l2);
		l.removeAll(l2);
		System.out.println("Removed Common Values Set : " + l);
	}

}
