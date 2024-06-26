/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	private double gpa; // The GPA of the student
	private int credits; // The credits of the student

	public Student(String name, short age, int credits, String address) {
		super(name, age, address);
		this.credits = credits;
	}

	/**
	 * @description This method is used to get the GPA of the student
	 * @return The GPA of the student
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @description This method is used to set the GPA of the student
	 * @param gpa The GPA to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * @description This method is used to get the credits of the student
	 * @return The credits of the student
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @description This method is used to set the credits of the student
	 * @param credits The credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * @description This method is used to get the address of the student
	 * @return The address of the student
	 */
	@Override
	public String getAddress() {
		return this.address;
	}

	/**
	 * @description This method is used to set the address of the student
	 * @param address The address to set
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @description This method is used to get the string representation of the
	 *              student
	 * @return The string representation of the student
	 */
	@Override
	public String toString() {
		return "Student{name=" + getName() + ", age=" + getAge() + ", credits=" + credits + ", gpa=" + gpa + "}";
	}
}