package Com.gl.emailapp.main;

import java.util.Scanner;

import Com.gl.emailapp.service.CredentialServiceImpl;

public class EmailApp {

	public interface CredentialService {

	}

	public static void main(String[] args) {
		CredentialServiceImpl service = new CredentialServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		Com.gl.emailapp.model.Employee employee = new Com.gl.emailapp.model.Employee(firstName, lastName);

		String dept = null;

		service.passwordGreneartor();
		System.out.println("Please Enter the Department from the following ");
		System.out.println("1. Press 1 for Technical");
		System.out.println("2. Press 2 for Admin");
		System.out.println("3. Press 3 for Human Resource");
		System.out.println("4. Press 4 for Legal");
		System.out.println("-----------------------------------------------");
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "legal";

			break;

		default:
			System.out.println("Enter the correct choice");
			break;
		}
		service.emailGeneartor(employee, dept);
		service.displayCredentials(employee, dept);

	}

}
