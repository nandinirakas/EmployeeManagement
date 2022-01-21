package com.employee.view;

import com.employee.main.EmployeeMain;
import com.employee.service.EmployeeManagementValidation;

public class EmployeeInformation {
	public static int employeeId() {
		System.out.println("Enter employee Id:");
		return EmployeeManagementValidation.employeeIdValidation(EmployeeMain.SCANNER.nextInt());
	}

	public static String employeeName() {
		System.out.println("Enter employee Name:");
		return EmployeeManagementValidation.employeeNameValidation(EmployeeMain.SCANNER.next());
	}

	public static long employeeSalary() {
		System.out.println("Enter employee salary:");
		return EmployeeMain.SCANNER.nextInt();
	}

	public static String employeePhoneNumber() {
		System.out.println("Enter employee phone number:");
		return EmployeeManagementValidation.phoneNumberValidation(EmployeeMain.SCANNER.next());
	}

	public static String employeeJoiningDate() {
		System.out.println("Enter employee joining date(dd-MM-yyyy):");
		return EmployeeManagementValidation.dateValidation(EmployeeMain.SCANNER.next());
	}
}
