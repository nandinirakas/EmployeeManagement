package com.employee.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import com.employee.model.Employee;

/**
 * Implementation of the methods that are given in interface.
 * Created a linked hashmap collection for storing details for storing in order and better performance.
 */
public class EmployeeMangementImpl implements EmployeeManagement {
	private final LinkedHashMap<Integer, Employee> EMPLOYEE_DETAILS = new LinkedHashMap<Integer, Employee>();

	/**
	 * Adding a new employee. Here employee id is set to key and
	 * other details like employee name, salary, phone number and joining date are
	 * jointly stored in an object named employee.
	 * 
	 * @param employeeId 
	 * @param employee Object contains name, salary, phone number and date
	 */
	public void addNewEmployee(int employeeId, Employee employee) {
		EMPLOYEE_DETAILS.put(employeeId, employee);
	}

	/**
	 * Showing all employee details that are stored in the list by using iterator.
	 * Entry will give both key and value.
	 */
	public void viewEmployees() {
		Iterator<Entry<Integer, Employee>> iterator = EMPLOYEE_DETAILS.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Employee> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	/**
	 * Deleting each employee details that are stored in the list
	 * based on employee id.
	 * 
	 * @param employeeId
	 */
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

	/**
	 * Replacing each employee details and also for replacing all
	 * values at a time based on employee id.
	 * 
	 * @param employeeId
	 * @param employee
	 */
	public void updateEmployee(int employeeId, Employee employee) {
		boolean employeeIdFound = false;
		Iterator<Integer> iterator = EMPLOYEE_DETAILS.keySet().iterator();

		while (iterator.hasNext()) {
			int employeeIdKey = iterator.next();
			Employee employeeData = EMPLOYEE_DETAILS.get(employeeIdKey);

			if (employeeIdKey == employeeId) {
				
				/**
				 * In first if condition, except name all datas are kept as null. So that when name is entered in object it get 
				 * satisfied and enter into the loop. The same operation is done for all else if and else conditions.
				 */
				if ((employee.getSalary() == 0) && (employee.getPhoneNumber() == null)
						&& (employee.getDate() == null)) { 
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
					employeeData.setSalary(employee.getSalary()); // update all details
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
