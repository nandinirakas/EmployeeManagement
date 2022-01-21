package com.employee.service;

import com.employee.model.Employee;

public interface EmployeeManagement {
	public void addNewEmployee(int employeeId, Employee employee);

	public void viewEmployees();

	public void deleteEmployee(int employeeId);

	public void updateEmployee(int employeeId, Employee employee);
}
