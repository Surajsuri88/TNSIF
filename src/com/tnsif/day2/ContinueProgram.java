package com.tnsif.day2;

public class ContinueProgram {
	public static void main(String[]args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println("skiped multiple of 2 ");
				continue;
			}
		}
	}

}
