package com.employee.model;

public class Employee {
	private String employeeName;
	private long salary;
	private String phoneNumber;
	private String date;

	public Employee() {
		super();
	}

	public Employee(String employeeName, long salary, String phoneNumber, String date) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.date = date;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return new StringBuffer().append(employeeName).append(" ").append(salary).append(" ").append(phoneNumber)
				.append(" ").append(date).toString();
	}
}
