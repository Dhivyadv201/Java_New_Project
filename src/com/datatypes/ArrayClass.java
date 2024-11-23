package com.datatypes;

import java.util.ArrayList;

import java.util.List;

public class ArrayClass {

	public static void main(String[] args) {

		List<Integer> n = new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);
		n.add(70);
		n.add(60);
		System.out.println(n);
		int size = n.size();
		System.out.println("size of the list is " + size);
		int indexof = n.indexOf(60);
		System.out.println("Index value of 60 is " + indexof);
		boolean contains = n.contains(90);
		System.out.println("90 is contain in the list " + contains);
		int get = n.get(5);
		System.out.println("5th index is " + get);

		// List<String> Fruits=new ArrayList<>();
		// Fruits.add("Apple");
		// Fruits.add("Banana");
		// Fruits.add("Grapes");
		// Fruits.add("Strawberry");
		// Fruits.add("Mango");
		// Fruits.add("Papaya");
		// Fruits.add("Apple");
		// Fruits.add("Plum");
		// System.out.println(Fruits);
		// Fruits.remove(6);
		// System.out.println(Fruits);
		// Fruits.addAll(n);
		// System.out.println(Fruits);

		List<Integer> l = new ArrayList<>();
		l.add(80);
		l.add(90);
		l.add(100);
		System.out.println(l);
		l.addAll(n);
		System.out.println(l);
		l.retainAll(n);
		System.out.println(l);
		l.removeAll(n);
		System.out.println(l);
	}
}
