package org.col;

import java.util.TreeSet;

public class Challenge15 {

	public static void main(String[] args) {
		//nput : List = 10, 20, 30, 40, 50, 60, 70, 80
		//Input : List = 100, 200, 300, 400, 500, 600, 700, 800
		TreeSet<Integer> l = new TreeSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		TreeSet<Integer> l1 = new TreeSet<Integer>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		l1.add(600);
		l1.add(700);
		l1.add(800);
		System.out.println("First Tree Set Values : " + l);
		System.out.println("Second Tree Set Values : " + l1);
		boolean com = l.retainAll(l1);
		System.out.println("Common Values presented r not : " + com);
		System.out.println("Common Values At both Sets : " + l);
		
				
	}

}
