package com.tnsif.assessment;
import java.util.Scanner;

public class Assessment {
	Scanner scan=new Scanner(System.in);
	String name,source,dest;
	public void input_data() {
		System.out.println("Enter Name : \n");
		name=scan.nextLine();
		System.out.println("Enter Source : \n");
		source=scan.nextLine();
		System.out.println("Enter Destination : \n");
		dest=scan.nextLine();
		
	
	}
	
	public void display() {
		System.out.println("Dear "+name+","+" Welcome onboard with service from "+source+" to "+dest+". Thankyou for using Sky Airlines. Enjoy your flight !!");
	}
	

	public static void main(String[] args) {
		Assessment obj=new Assessment();
		obj.input_data();
		obj.display();
				
		


	}

}
