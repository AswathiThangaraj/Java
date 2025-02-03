//package name
package com.wipro.java.oops.inheritance;

//Parent class = Employee
//Child class = Developer
//Extends = is a keyword

public class Developer extends Employee {

	//default constructor
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
//		Child object is instantiated from child constructor
//		Parent class consumes the properties and behaviors of child class
		
		Employee employee1 = new ProjectLead();
		employee1.setId(1235);
		employee1.setName("Developer");
		employee1.setEmailid("developer123@gmail.com");
		employee1.setLocation("China");
		employee1.setSalary(70.1f);
		
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getEmailid());
		System.out.println(employee1.getLocation());
		System.out.println(employee1.getSalary());
	} 

}
