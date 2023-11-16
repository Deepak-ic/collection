package org.col;

import java.util.HashSet;

public class Challenge16 {

	public static void main(String[] args) {
		//Input : List = 10, 20, 30, 90, 10, 10, 40, 50
		//Input : List = 30, 40, 50, 60, 80
		HashSet<Integer> l = new HashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		HashSet<Integer> l1 = new HashSet<Integer>();
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		System.out.println("First HashSet Values : " + l);
		System.out.println("Second HashSet Values : " + l1);
		l.removeAll(l1);
		System.out.println("Common Values Removed : " + l);
	}

}
