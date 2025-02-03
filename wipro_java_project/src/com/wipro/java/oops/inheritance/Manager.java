//package name
package com.wipro.java.oops.inheritance;

//Parent class = Employee
//Child class = Manager
//Extends = is a keyword

public class Manager extends Employee {

	//Default constructor
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
//		Child object is instantiated from child constructor
//		Parent class consumes the properties and behaviors of child class
		
		Employee employee2 = new ProjectLead();
		employee2.setId(123);
		employee2.setName("Manager");
		employee2.setEmailid("manager23@gmail.com");
		employee2.setLocation("Japan");
		employee2.setSalary(50.1f);
		
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getEmailid());
		System.out.println(employee2.getLocation());
		System.out.println(employee2.getSalary());
	}
	
}