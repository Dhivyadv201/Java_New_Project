package com.datatypes;

public class Condtional_Statements{
	
		public static void main (String[] args) {
			
			int i=45;
			
				if (i==50){
				System.out.println("Grade E");
				}
				
				else if(i>=51 && i <= 60){
				System.out.println("Grade D");
				}
				
				else if (i>=61 && i<=70){
				System.out.println("Grade C");
				}
				
				else if (i>=71 && i<=80){
				System.out.println("Grade B");
				}
				
				else if (i>=81 && i<=100) {
				System.out.println("Grade A");	
				}
				
				else {
				System.out.println("FAIL");
				}
		}

}
