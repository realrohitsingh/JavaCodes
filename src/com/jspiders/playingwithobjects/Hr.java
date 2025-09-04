package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Hr {
	static void displayEmployeeDetails(Employee e) {
		if (e != null) {
			System.out.println("EID : " + e.eid);
			System.out.println("CTC : " + e.ctc);
		}
	}

	static Employee createEmployee() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter EID");
		int eid = scn.nextInt();
		System.out.println("Enter CTC");
		double ctc = scn.nextDouble();
		Employee e = new Employee(eid, ctc);
		return e;
	}
}
