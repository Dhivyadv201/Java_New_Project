package com.datatypes;

public class Encapsulation {

	public void employeeName() {

		System.out.println("Employee Name: Dhivya");
	}

	public void employeeID() {

		System.out.println("Employee ID: e402813");
	}

	public void employeeDesignation() {

		System.out.println("Employee Desigantion: Executive");
	}

	public void employeeMailID() {

		System.out.println("Employee MailID: dhivya@gmail.com");
	}

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.employeeName();
		e.employeeMailID();
		e.employeeID();
		e.employeeDesignation();
	}
}
