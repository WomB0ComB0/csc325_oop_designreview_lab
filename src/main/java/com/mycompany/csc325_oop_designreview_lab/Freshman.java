package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman is a subclass of Student representing a freshman student.
 * It inherits all properties and methods from the Student class.
 * This class is used to create and manage freshman students.
 * 
 * @see Student
 */
public class Freshman extends Student {
  /**
   * @description This method is used to construct a new Freshman object with the
   *              specified name, age, credits, and address.
   * 
   * @param name    The name of the freshman
   * @param age     The age of the freshman
   * @param credits The number of credits the freshman has
   * @param address The address of the freshman
   */
  public Freshman(String name, short age, int credits, String address) {
    super(name, age, credits, address);
  }

  /**
   * @description This method is used to get the string representation of the
   *              Freshman object
   * @return A string representation of the Freshman object
   */
  @Override
  public String toString() {
    return "Freshman{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", gpa=" + getGpa()
        + ", address=" + getAddress() + "}";
  }
}
