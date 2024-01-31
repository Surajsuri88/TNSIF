package com.tnsif.day2;

public class All_If_statement {
	public static void main(String[]args) {
		// if statement
		int x= 5;
		if(x==5) {
			System.out.println("x = 5  if statement executed");
		}
		
		
		
		
		//if else statement
		
		if(x==8) {
			System.out.println("x = 8 if statement executed");
		}
		else {System.out.println("x != 8  if else statement executed");}
		
		
		
		
		
		//nested if else
		
		if(x==10) {
			System.out.println("x=10");
			if(x==5) {
				System.out.println("x=5");
			}
		}
		else {
			if(x==5) {
				System.out.println("x=5 nested if else executed");
			}
		}
	}

}
