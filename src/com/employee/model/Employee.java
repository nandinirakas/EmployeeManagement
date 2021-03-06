package com.employee.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Gives information about employee
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private long salary;
	private String phoneNumber;
	private Date date;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, long salary, String phoneNumber, Date date) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.date = date;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
		return String.format("%s %s %s %s", employeeName, String.valueOf(salary), phoneNumber, dateFormat.format(date));

	}
}
