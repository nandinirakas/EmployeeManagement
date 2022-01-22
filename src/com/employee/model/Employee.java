package com.employee.model;

import java.util.Date;

/**
 * Gives information about employee
 */
public class Employee {
	/**
	 * Represents employee name, salary, phone number and joining date.
	 */
	private String employeeName;
	private long salary;
	private String phoneNumber;
	private Date date;

	public Employee() {
		super();
	}

	/**
	 * Creates an employee data
	 * 
	 * @param employeeName The employee’s name.
	 * @param salary       The employee’s salary.
	 * @param phoneNumber  The employee’s phone number.
	 * @param date         The employee’s joining date.
	 */
	public Employee(String employeeName, long salary, String phoneNumber, Date date) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.date = date;
	}

	/**
	 * Gets the employee name.
	 * 
	 * @return A string representing the employee’s name.
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Sets the employee’s name.
	 * 
	 * @param employeeName A String containing the employee’s name.
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * Gets the employee salary.
	 * 
	 * @return A string representing the employee’s salary.
	 */
	public long getSalary() {
		return salary;
	}

	/**
	 * Sets the employee’s salary.
	 * 
	 * @param salary A String containing the employee’s salary.
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}

	/**
	 * Gets the employee phone number.
	 * 
	 * @return A string representing the employee’s phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the employee’s phone number.
	 * 
	 * @param phoneNumber A String containing the employee’s phone number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the employee joining date.
	 * 
	 * @return A string representing the employee’s joining date.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the employee’s joining date.
	 * 
	 * @param date A String containing the employee’s joining date.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Displaying the values that are entered.
	 */
	public String toString() {
		return new StringBuffer().append(employeeName).append(" ").append(salary).append(" ").append(phoneNumber)
				.append(" ").append(date).toString();
	}
}
