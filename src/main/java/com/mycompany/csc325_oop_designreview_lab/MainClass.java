/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	/**
	 * @description This method is the entry point of the application.
	 * It creates instances of Student, Freshman, and Senior classes,
	 * sets their GPA values based on user input, and prints their details.
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Student std1 = new Student("James", (short) 20, 12, "123 Main St");
		System.out.println(std1); // Use the std1 variable

		/**
		 * This code is used to create two instances of the Freshman and Senior classes
		 */
		Freshman freshman = new Freshman("James", (short) 20, 12, "123 Main St");
		Senior senior = new Senior("John", (short) 30, 90, "456 Main St");

		/**
		 * This code is used to set the GPA of the freshman and senior
		 * using the scanner and user input
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter GPA for " + freshman.getName() + ": ");
			double gpa = scanner.nextDouble();
			freshman.setGpa(gpa);

			System.out.print("Enter GPA for " + senior.getName() + ": ");
			gpa = scanner.nextDouble();
			senior.setGpa(gpa);
		}

		/**
		 * This code is used to print the details of the freshman and senior
		 */
		System.out.println(freshman);
		System.out.println(senior);
	}
}
