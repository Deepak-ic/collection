package org.col;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Challenge8 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		l.add(505);
		l.add(605);
		System.out.println("List Values : " + l);
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(l);
		System.out.println("Set Values : " + s);
	}

}
