package com.tnsif.assesment2;
import java.util.Scanner;

public class Customer {
	
	
	
	void cal(String userinput) {
		int i,j,x,y,z;
		for (i=0;i<userinput.length();i++) {
			char ch= userinput.charAt(i);
			if(ch == ':') {
				break;
			}
			}j=i;
		String name = userinput.substring(0,j);
		x = Character.getNumericValue(userinput.charAt(j+1));
		y = Character.getNumericValue(userinput.charAt(j+3));
		z = Character.getNumericValue(userinput.charAt(j+5));
		
		int total=(x*1000*z)+(y*650*z);
		if(x<=0) {
			System.out.println("invalid no of adults");
			return;}
			
		else if(y<0) {
				System.out.println("invalid no of children");
				return;}
				
		else if(z<=0) {
					System.out.println("invalid no of days");
					return;}
					
		else {
			System.out.println(name+" your booking is confirmed:\nTotal number of adults :"+x+"\nTotal number of children :"+y+"\nTotal number of days :"+z+"\nTotal cost is "+total);
		}

		
		
		
		
	}
	


	public static void main (String[]args) {
		Scanner obj = new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter details in this below format\n <username>:<no of adults>:<no of children>:<no of days>");
		String userinput=obj.nextLine();
		c.cal(userinput);
	}
}
 