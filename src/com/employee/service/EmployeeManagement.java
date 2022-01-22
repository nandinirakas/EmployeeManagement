package com.employee.service;

import com.employee.model.Employee;

/**
 * This interface gives knowledge about the different method implementations in this project.
 * It supports functions like adding new employees, showing all employees, deleting and updating details.
 * These methods are implemented in EmployeeMangementImpl class.
 */
public interface EmployeeManagement {
	public void addNewEmployee(int employeeId, Employee employee);

	public void viewEmployees();

	public void deleteEmployee(int employeeId);

	public void updateEmployee(int employeeId, Employee employee);
}
