package org.col;

import java.util.LinkedHashSet;

public class Challenge14 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println("LinkedHashSet 1 Values : " + l1);
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(60);
		l2.add(50);
		l2.add(40);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		boolean com = l1.retainAll(l2);
		System.out.println("LinkedHashSet 2 values : " + l2);
		System.out.println("Common Values Set1 & Set2 :" + l1);
		System.out.println("Common Values Set1 & Set2 : " + com);
	}

}
