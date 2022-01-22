package com.employee.main;

import java.util.Scanner;
import com.employee.controller.EmployeeController;
import com.employee.model.Employee;
import com.employee.view.EmployeeInformation;

/**
* The simple Employee Management program using CRUD operation performs 
* functions like create new employee detail, viewing the list of employee registered, 
* replacing old data with new data and deleting whole employee data with employee id. 
*/

public class EmployeeMain {
	public static final Scanner SCANNER = new Scanner(System.in);
	private static final EmployeeController EMPLOYEE_CONTROL = new EmployeeController();

	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("1.COLLECT DETAILS\n2.VIEW DETAILS\n3.DELETE DETAILS\n4.UPDATE DETAILS\nEnter your choice:");
			choice = SCANNER.nextInt();

			switch (choice) {
			case 1:
				addNewEmployee();
				break;
			case 2:
				viewEmployees();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				updateEmployeeDetails();
				break;
			default:
				System.exit(0);
			}
		} while (choice != 0);
	}

	private static void addNewEmployee() {
		int employeeId = EmployeeInformation.employeeId();
		String employeeName = EmployeeInformation.employeeName();
		long salary = EmployeeInformation.employeeSalary();
		String phoneNumber = EmployeeInformation.employeePhoneNumber();
		String date = EmployeeInformation.employeeJoiningDate();

		Employee employee = new Employee(employeeName, salary, phoneNumber, date);
		EMPLOYEE_CONTROL.addNewEmployee(employeeId, employee);
	}

	private static void viewEmployees() {
		EMPLOYEE_CONTROL.viewEmployees();
	}

	private static void deleteEmployee() {
		int employeeId = EmployeeInformation.employeeId();

		EMPLOYEE_CONTROL.deleteEmployee(employeeId);
	}

	public static void updateEmployeeDetails() {
		int choice;
		System.out.println("Choose option to update\n1.Update all details\n2.Employee Name\n3.Employee Salary\n4.Employee Phone Number\n5.Employee Joining Date");
		choice = EmployeeMain.SCANNER.nextInt();

		if (choice == 1) {
			updateEmployee();
		} else if (choice == 2) {
			updateEmployeeName();
		} else if (choice == 3) {
			updateEmployeeSalary();
		} else if (choice == 4) {
			updateEmployeePhoneNumber();
		} else if (choice == 5) {
			updateEmployeeJoiningDate();
		} else {
			System.out.println("Invalid choice");
		}
	}

	private static void updateEmployee() {
		int employeeId = EmployeeInformation.employeeId();
		String employeeName = EmployeeInformation.employeeName();
		long salary = EmployeeInformation.employeeSalary();
		String phoneNumber = EmployeeInformation.employeePhoneNumber();
		String date = EmployeeInformation.employeeJoiningDate();

		Employee employee = new Employee(employeeName, salary, phoneNumber, date);
		EMPLOYEE_CONTROL.updateEmployee(employeeId, employee);
	}

	private static void updateEmployeeName() {
		int employeeId = EmployeeInformation.employeeId();
		String employeeName = EmployeeInformation.employeeName();

		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		EMPLOYEE_CONTROL.updateEmployee(employeeId, employee);
	}

	private static void updateEmployeeSalary() {
		int employeeId = EmployeeInformation.employeeId();
		long salary = EmployeeInformation.employeeSalary();

		Employee employee = new Employee();
		employee.setSalary(salary);
		EMPLOYEE_CONTROL.updateEmployee(employeeId, employee);
	}

	private static void updateEmployeePhoneNumber() {
		int employeeId = EmployeeInformation.employeeId();
		String phoneNumber = EmployeeInformation.employeePhoneNumber();

		Employee employee = new Employee();
		employee.setPhoneNumber(phoneNumber);
		EMPLOYEE_CONTROL.updateEmployee(employeeId, employee);
	}

	private static void updateEmployeeJoiningDate() {
		int employeeId = EmployeeInformation.employeeId();
		String date = EmployeeInformation.employeeJoiningDate();

		Employee employee = new Employee();
		employee.setDate(date);
		EMPLOYEE_CONTROL.updateEmployee(employeeId, employee);
	}
}
