package com.jspiders.playingwithobjects;

public class Mainclass1 {
	public static void main(String[] args) {
		Employee e1=Hr.createEmployee();
		Hr.displayEmployeeDetails(e1);
		System.out.println("-----------");
		Employee e2=Hr.createEmployee();
		Hr.displayEmployeeDetails(e2);
		System.out.println("-----------");
		Employee e3=Hr.createEmployee();
		Hr.displayEmployeeDetails(e3);
	}
}
