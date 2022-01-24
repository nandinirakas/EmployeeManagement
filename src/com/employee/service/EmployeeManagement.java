package com.employee.service;

import com.employee.model.Employee;
/**
 * Used to achieve abstraction and multiple inheritance.
 * Interfaces can have abstract methods and variables.
 */
public interface EmployeeManagement {
	void addNewEmployee(int employeeId, Employee employee);

	void viewEmployees();

	void deleteEmployee(int employeeId);

	void updateEmployee(int employeeId, Employee employee);
}
