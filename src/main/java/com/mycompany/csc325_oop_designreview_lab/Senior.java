package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior is a subclass of Student representing a senior student.
 * It inherits all properties and methods from the Student class.
 * This class is used to create and manage senior students.
 * 
 * @see Student
 */
public class Senior extends Student {
  /**
   * @description   This method is used to construct a new Senior object with the
   *                specified name, age, credits, and address.
   *                Ensures that the senior has at least 85 credits.
   * 
   * @param name    The name of the senior
   * @param age     The age of the senior
   * @param credits The number of credits the senior has
   * @param address The address of the senior
   * @throws IllegalArgumentException if the senior has less than 85 credits
   */
  public Senior(String name, short age, int credits, String address) {
    super(name, age, credits, address);
    if (credits < 85) {
      throw new IllegalArgumentException("Senior must have at least 85 credits");
    }
  }

  /**
   * @description This method is used to get the string representation of the
   *              Senior object
   * @return A string representation of the Senior object
   */
  @Override
  public String toString() {
    return "Senior{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", gpa=" + getGpa()
        + ", address=" + getAddress() + "}";
  }
}
