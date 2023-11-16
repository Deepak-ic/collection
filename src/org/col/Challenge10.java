package org.col;

import java.util.LinkedHashSet;

public class Challenge10 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		System.out.println("Set Values : " + l);
		for (Integer i : l) {
			System.out.println(i);
		}
		
	}

}
