package com.datatypes;

public class Conditional_Statementex2 {
	
	public static void main(String[] args) {
	
	int amount=45000000;
	
		if (amount>=35000000 && amount<=50000000) {
		System.out.println("BMW X4 white colour car");
		}
	
		else if (amount>=25000000 && amount<=30000000) {
		System.out.println("Benz black colour car");
		}
	
		else if (amount>=20000000 && amount<=23000000) {
		System.out.println("Audi Q3 Red colour car");
		}
	
		else if (amount>=15000000 && amount<10000000) {
		System.out.println("Innova blue colour car");
		}
	
		else {
		System.out.println("Don't buy a car");
		}
	}
}