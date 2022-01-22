package com.employee.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.employee.view.EmployeeInformation;

/**
 * This class is for validating details that are received from user. 
 * After validation, if it satisfy the condition the data will be returned otherwise
 * the same methods will be called to get another valid data.
 */
public class EmployeeManagementValidation {
	/**
	 * Validating employee id by accepting only numbers. If any character is given
	 * as input the method is called again to get desired input.
	 * 
	 * @return String to integer id
	 */
	public static int employeeIdValidation(String employeeId) {

		if (!(employeeId.matches("[0-9]{1,}"))) {
			System.out.println("Please enter valid id that contains only numbers");
			return EmployeeInformation.employeeId();
		}
		return Integer.parseInt(employeeId);
	}

	/**
	 * Validating employee name by accepting only alphabets. If any other special
	 * character and numbers are given as input, the method is called again to get
	 * desired input.
	 * 
	 * @return employeeName
	 */
	public static String employeeNameValidation(String employeeName) {
		Pattern pattern = Pattern.compile("[A-Za-z]{1,}");
		Matcher match = pattern.matcher(employeeName);

		if (!(match.find() && match.group().equals(employeeName))) {
			System.out.println("Invalid, Please enter a valid Name");
			return EmployeeInformation.employeeName();
		}
		return employeeName;
	}

	/**
	 * Validating employee phone numbers by accepting only 10 digit numbers
	 * starting with 6-9. If any other special character and more than 10 numbers
	 * are given as input, then the method is called again to get desired input.
	 * 
	 * @return phoneNumber
	 */
	public static String phoneNumberValidation(String phoneNumber) {

		if (!(phoneNumber.matches("[6-9][0-9]{9}"))) {
			System.out.println("Please enter valid 10 digit phone number");
			return EmployeeInformation.employeePhoneNumber();
		}
		return phoneNumber;
	}

	/**
	 * Validating employee joining date by checking day, month, year of default
	 * calendar method. If any input other than predefined values are given, then
	 * the method is called again to get desired input.
	 * 
	 * @return date
	 */
	public static Date dateValidation(String joiningDate) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		Date date;

		try {
			date = dateFormat.parse(joiningDate);
			dateFormat.setLenient(true);
		} catch (Exception exception) {
			System.out.println("Please enter valid date");
			return EmployeeInformation.employeeJoiningDate();
		}
		return date;
	}

	/**
	 * Validating employee salary by accepting only numbers. If any character is
	 * given as input, the method is called again to get desired input.
	 * 
	 * @return String to long salary value
	 */
	public static long employeeSalaryValidation(String employeeSalary) {

		if (!(employeeSalary.matches("[0-9]{1,}"))) {
			System.out.println("Please enter valid salary detail that contains only numbers");
			return EmployeeInformation.employeeSalary();
		}
		return Integer.parseInt(employeeSalary);
	}
}
