package com.tnsif.day1;
import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,x;
		char r;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=obj1.nextFloat();
		b=obj1.nextFloat();
		System.out.println("Press + :for addition\nPress - :for subtraction\nPress / :for division\nPress * :for multiplication");
		r=obj1.next().charAt(0);
		switch(r) {
		case '+':x=a+b;
				 System.out.println("addition "+x);
				 break;
		case '-':x=a-b;
				 System.out.println("subtraction "+x);
				 break;
		default: System.out.println("invalid choice");
		}
		
		

	}

}
