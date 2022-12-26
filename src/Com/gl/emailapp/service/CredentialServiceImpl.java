package Com.gl.emailapp.service;

import java.util.Random;

import Com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements credentialservice {

	private int department;
	private Object employee;

	public String passwordGreneartor() {
		// TODO Auto-generated method stub
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&_=+-/.?<>";
		String values = capChars + smallChars + numbers + symbols;

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
		}
		return new String(password);
	}

	public String emailGeneartor(Employee employee, String depatment) {
		// TODO Auto-generated method stub
		return (employee.getFirstName() + employee.getFirstName() + employee.getLastName()).toLowerCase() + "@"
				+ department + ".abc.com";

	}

	public void displayCredentials(Employee emp, String department) {
		System.out.println(
				"Dear" + emp.getFirstName() + " " + emp.getLastName() + " your generated credentails are as follows:");
		System.out.println("Email:-->" + emailGeneartor(emp, department));
		System.out.println("Password:->+" + passwordGreneartor());

	}

	public Object getEmployee() {
		return employee;
	}

	public void setEmployee(Object employee) {
		this.employee = employee;
	}

}
