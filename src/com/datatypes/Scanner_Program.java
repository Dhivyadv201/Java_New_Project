package com.datatypes;

import java.util.Scanner;

public class Scanner_Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name = s.next();
		
		System.out.println(name);
		
		//s.nextLine();
		
		System.out.println("Enter your Department:");
		String department =s.nextLine();
		System.out.println(department); 
}

		
	}
