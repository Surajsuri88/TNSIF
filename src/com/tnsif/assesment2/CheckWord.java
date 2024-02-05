package com.tnsif.assesment2;
import java.util.Scanner;
public class CheckWord {
	
	void check(String sentence,String word) {
		if(sentence.toLowerCase().contains(word.toLowerCase())) {
			System.out.println("the word \""+word+"\" is present in the sentence \""+sentence+"\".");
		}
		else {
			System.out.println("the word \""+word+"\" is not present in the sentence \""+sentence+"\".");

			
		}
	}
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		CheckWord obj=new CheckWord();
		System.out.println("Enter the sentence :");
		String sentence=scan.nextLine();
		System.out.println("Enter the word");
		String word = scan.nextLine();
		
		obj.check(sentence, word);
	}

}
