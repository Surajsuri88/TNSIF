package com.tnsif.day3;

import java.util.Scanner;

public class CustomerDemo_ip_const {

	// created object for customer class, used def const, para const
	//used scanner object,user input
	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		String name,id,city;
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter Id");
		id= sc.nextLine();
		System.out.println("Enter city");
		city = sc.nextLine();
		
		System.out.println( );
		
		//default constructor
		Customer  c1 = new Customer();
		
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		
		System.out.println(c1);
		
		//parameterized constructor
		Customer c2 = new Customer(name,id,city);
		System.out.println("Enter name");
		name = sc.nextLine();
		
		System.out.println("Enter Id");
		id= sc.nextLine();
		
		System.out.println("Enter city");
		city = sc.nextLine();
		
		
		c2.setCustomerName(name);
		c2.setCustomerId(id);
		c2.setCustomerCity(city);
		
		sc.close();
		
		System.out.println(c2);
		

	}

}

