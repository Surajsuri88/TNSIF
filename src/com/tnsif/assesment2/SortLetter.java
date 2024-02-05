package com.tnsif.assesment2;

import java.util.Arrays;
import java.util.Scanner;

public class SortLetter {
	
	void sort(String sentence) {
		
		
		if (sentence.matches(".*\\d.*")) {
		System.out.println(sentence+" : Is an invalid input");}
		
		else {
		String words[] = sentence.split("\\s+");
		for(String word:words) {
			char charArray[] = word.toCharArray();
			Arrays.sort(charArray);
			
			String sortedWord = new String(charArray);
			System.out.print(sortedWord + " ");
		
		}
	}
	
	}
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=scan.nextLine();
		SortLetter s =new SortLetter();
		s.sort(sentence);
		
	}

}
