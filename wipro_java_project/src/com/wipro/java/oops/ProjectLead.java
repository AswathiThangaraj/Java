package com.wipro.java.oops;

//Parent class = Employee
//Child class = ProjectLead
//Extends = is a keyword

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
//		Child object is instantiated from child constructor
//		Parent class consumes the properties and behaviors of child class
		
		Employee employee = new ProjectLead();
		employee.setId(1234);
		employee.setName("Ram");
		employee.setEmailid("ram23@gmail.com");
		employee.setLocation("Tiruppur");
		employee.setSalary(31.19f);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmailid());
		System.out.println(employee.getLocation());
		System.out.println(employee.getSalary());
	} 

}
