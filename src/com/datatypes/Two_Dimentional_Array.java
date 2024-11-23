package com.datatypes;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		
		int a = 100;
		
		int [][] twoArray = new int [3][3];
		
		for (int i = 0; i < twoArray.length; i++) {
			
			for (int j = 0; j < twoArray.length; j++) {
				
				twoArray[i][j] = a;
				
			}
		}
		for (int i = 0; i < twoArray.length; i++) {
			
			for (int j = 0; j < twoArray.length; j++) {
				
				System.out.print(twoArray[i][j] + "\t");
				
			}
			System.out.println();
		}
	}
}
