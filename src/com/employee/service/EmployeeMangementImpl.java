package com.employee.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.employee.model.Employee;

/**
 * Implementation of the methods that are given in interface.
 * Created a linked hashmap collection for storing details to maintain order and better performance.
 */
public class EmployeeMangementImpl implements EmployeeManagement {
	private final Map<Integer, Employee> EMPLOYEE_DETAILS = new LinkedHashMap<>();

	/**
	 * Adding a new employee.
	 * 
	 * @param employeeId 
	 * @param employee Object contains name, salary, phone number and date
	 */
	public void addNewEmployee(int employeeId, Employee employee) {

		if (EMPLOYEE_DETAILS.containsKey(employeeId)) {
            System.out.println("The given Id already present");
        } else {
		EMPLOYEE_DETAILS.put(employeeId, employee);
        }
	}

	/**
	 * Showing all employee details that are stored in the list by using for each.
	 * Entry will give both key and value.
	 */
	public void viewEmployees() {
		
		for (Entry<Integer, Employee> entry : EMPLOYEE_DETAILS.entrySet()) {
		    Integer key = entry.getKey();
		    Object value = entry.getValue();
		   	System.out.println(String.format("%s %s", String.valueOf(key), value));
		}
	}

	/**
	 * Deleting each employee details that are stored in the list
	 * based on employee id.
	 * 
	 * @param employeeId
	 */
	public void deleteEmployee(int employeeId) {
		boolean employeeIdDelete = false;
		EMPLOYEE_DETAILS.remove(employeeId);
		employeeIdDelete = true;

		if (!employeeIdDelete) {
			System.out.println("Employee id not found");
		} else {
			System.out.println("Record deleted successfully");
		}
	}

	/**
	 * Replacing each employee details based on employee id.
	 * 
	 * @param employeeId
	 * @param employee
	 */
	public void updateEmployee(int employeeId, Employee employee) {
		boolean employeeIdUpdate = false;
		Iterator<Integer> iterator = EMPLOYEE_DETAILS.keySet().iterator();

		while (iterator.hasNext()) {
			int employeeIdKey = iterator.next();
			Employee employeeData = EMPLOYEE_DETAILS.get(employeeIdKey);

			if (employeeIdKey == employeeId) {
				
				if (employee.getEmployeeName() != null) { 
					employeeData.setEmployeeName(employee.getEmployeeName());
					employeeIdUpdate = true;
					break;
				} else if (employee.getSalary() != 0) {
					employeeData.setSalary(employee.getSalary());
					employeeIdUpdate = true;
					break;
				} else if (employee.getPhoneNumber() != null) {
					employeeData.setPhoneNumber(employee.getPhoneNumber());
					employeeIdUpdate = true;
					break;
				} else if (employee.getDate() != null) {
					employeeData.setDate(employee.getDate());
					employeeIdUpdate = true;
					break;
				}
			}
		}

		if (!employeeIdUpdate) {
			System.out.println("Employee id not found");
		} else {
			System.out.println("Record updated successfully");
		}
	}
}
