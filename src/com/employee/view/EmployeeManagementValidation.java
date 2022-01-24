package com.employee.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validating details that are received from user. 
 */
public class EmployeeManagementValidation {
	/**
	 * Validating employee id by accepting only numbers. If any character is given
	 * as input then the method is called again.
	 * 
	 * @return String to integer value of id
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
	 * character and numbers are given as input, then the method is called again..
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
	 * are given as input, then the method is called again.
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
	 * the method is called again to get desired input. By making setLeninent() to false
	 * it will check whether the given date is correct by strict rules like leap year, having wrong date format.
	 * 
	 * @return date
	 * @throws ParseException 
	 * @exception For parsing date
	 */
	public static Date dateValidation(String joiningDate) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		Date date;

		/**
		 * Parses the given joining date and save it in temporary variable named date.
		 * If any error present in try block, then it will come to catch and here the method for getting joining date
		 * of employee from user is called again.
		 */
		try {
			date = dateFormat.parse(joiningDate);
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
