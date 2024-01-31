package com.tnsif.day6;




public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		System.out.println(Employee.companyName);
		System.out.println(Employee.salary);
	
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		System.out.println(e.salary);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Deep", 321);
		System.out.println(e.companyName);
	}
}