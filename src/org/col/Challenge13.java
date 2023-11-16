package org.col;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Challenge13 {

	public static void main(String[] args) {
		HashSet<Integer> l1 = new LinkedHashSet<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println("Set 1 Values : " + l1);
		HashSet<Integer> l2 = new LinkedHashSet<Integer>();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l2.add(80);
		boolean com = l1.retainAll(l2);
		System.out.println("Set 2 values : " + l2);
		System.out.println("Common Values Set1 & Set2 :" + l1);
		System.out.println("Common Values Set1 & Set2 : " + com);
	}

}
