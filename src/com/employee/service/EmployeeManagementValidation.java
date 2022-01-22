package com.employee.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.employee.view.EmployeeInformation;

public class EmployeeManagementValidation {
	public static int employeeIdValidation(String employeeId) {

		if (!(employeeId.matches("[0-9]{1,}"))) {
			System.out.println("Please enter valid id that contains only numbers");
			return EmployeeInformation.employeeId();
		}
		return Integer.parseInt(employeeId);
	}
	
	public static String employeeNameValidation(String employeeName) {
		Pattern pattern = Pattern.compile("[A-Za-z]{1,}");
		Matcher match = pattern.matcher(employeeName);

		if (!(match.find() && match.group().equals(employeeName))) {
			System.out.println("Invalid, Please enter a valid Name");
			return EmployeeInformation.employeeName();
		}
		return employeeName;
	}

	public static String phoneNumberValidation(String phoneNumber) {

		if (!(phoneNumber.matches("[6-9][0-9]{9}"))) {
			System.out.println("Please enter valid 10 digit phone number");
			return EmployeeInformation.employeePhoneNumber();
		}
		return phoneNumber;
	}

	public static String dateValidation(String date) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(date);
			dateFormat.setLenient(true);
		} catch (Exception exception) {
			System.out.println("Please enter valid date");
			return EmployeeInformation.employeeJoiningDate();
		}
		return date;
	}
	
	public static long employeeSalaryValidation(String employeeSalary) {

		if (!(employeeSalary.matches("[0-9]{1,}"))) {
			System.out.println("Please enter valid salary detail that contains only numbers");
			return EmployeeInformation.employeeSalary();
		}
		return Integer.parseInt(employeeSalary);
	}
}
