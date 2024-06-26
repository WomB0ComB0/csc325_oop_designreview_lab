/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
	private String name; // The name of the human
	private short age; // The age of the human
	protected String address; // The address of the human

	/**
	 * @description This method is used to construct a new Human object with the
	 *              specified name, age, and address.
	 * 
	 * @param name    The name of the human
	 * @param age     The age of the human
	 * @param address The address of the human
	 */
	public Human(String name, short age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * @description This method is used to get the name of the human
	 * @return The name of the human
	 */
	public String getName() {
		return name;
	}

	/**
	 * @description This method is used to set the name of the human
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @description This method is used to get the age of the human
	 * @return The age of the human
	 */
	public short getAge() {
		return age;
	}

	/**
	 * @description This method is used to set the age of the human
	 * @param age The age to set
	 */
	public void setAge(short age) {
		this.age = age;
	}

	/**
	 * @description This method is used to get the address of the human
	 * @return The address of the human
	 */
	public abstract String getAddress();

	/**
	 * @description This method is used to set the address of the human
	 * @param address The address to set
	 */
	public abstract void setAddress(String address);
}
