package org.col;

import java.util.HashSet;
import java.util.LinkedList;

public class Challenge7 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("LinkedList Velues : " + l);
		HashSet<Integer> s = new HashSet<Integer>();
		s.addAll(l);
		System.out.println("HashSet Values : " + s);
	}

}