package com.employee.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import com.employee.model.Employee;

public class EmployeeMangementImpl implements EmployeeManagement {
	private final LinkedHashMap<Integer, Employee> EMPLOYEE_DETAILS = new LinkedHashMap<Integer, Employee>();

	public void addNewEmployee(int employeeId, Employee employee) {
		EMPLOYEE_DETAILS.put(employeeId, employee);
	}

	public void viewEmployees() {
		Iterator<Entry<Integer, Employee>> iterator = EMPLOYEE_DETAILS.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Employee> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public void deleteEmployee(int employeeId) {
		boolean employeeIdFound = false;
		Iterator<Integer> iterator = EMPLOYEE_DETAILS.keySet().iterator();

		while (iterator.hasNext()) {
			int employeeIdValue = iterator.next();

			if (employeeIdValue == employeeId) {
				EMPLOYEE_DETAILS.remove(employeeId);
				employeeIdFound = true;
				break;
			}
		}

		if (!employeeIdFound) {
			System.out.println("Employee id not found");
		} else {
			System.out.println("Record deleted successfully");
		}
	}

	public void updateEmployee(int employeeId, Employee employee) {
		boolean employeeIdFound = false;
		Iterator<Integer> iterator = EMPLOYEE_DETAILS.keySet().iterator();

		while (iterator.hasNext()) {
			int employeeIdKey = iterator.next();
			Employee employeeData = EMPLOYEE_DETAILS.get(employeeIdKey);

			if (employeeIdKey == employeeId) {

				if ((employee.getSalary() == 0) && (employee.getPhoneNumber() == null) && (employee.getDate() == null)) {
					employeeData.setEmployeeName(employee.getEmployeeName());
					employeeIdFound = true;
					break;
				} else if ((employee.getPhoneNumber() == null) && (employee.getEmployeeName() == null)
							&& (employee.getDate() == null)) {
					employeeData.setSalary(employee.getSalary());
					employeeIdFound = true;
					break;
				} else if ((employee.getSalary() == 0) && (employee.getEmployeeName() == null)
							&& (employee.getDate() == null)) {
					employeeData.setPhoneNumber(employee.getPhoneNumber());
					employeeIdFound = true;
					break;
				} else if ((employee.getSalary() == 0) && (employee.getEmployeeName() == null)
							&& (employee.getPhoneNumber() == null)) {
					employeeData.setDate(employee.getDate());
					employeeIdFound = true;
					break;
				} else {
					employeeData.setEmployeeName(employee.getEmployeeName());
					employeeData.setSalary(employee.getSalary());
					employeeData.setPhoneNumber(employee.getPhoneNumber());
					employeeData.setDate(employee.getDate());

					EMPLOYEE_DETAILS.put(employeeIdKey, employeeData);
					employeeIdFound = true;
					break;
				}
			}
		}

		if (!employeeIdFound) {
			System.out.println("Employee id not found");
		} else {
			System.out.println("Record updated successfully");
		}
	}
}
