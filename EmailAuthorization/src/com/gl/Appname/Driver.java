package com.gl.Appname;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String sFname, sLname, SDepartment = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter First Name:");
			sFname = sc.next();
			System.out.println("Enter Last Name:");
			sLname = sc.next();
			System.out.println(
					"Select the Department:\n" + "1.Technical\n" + "2.Admin\n" + "3.Human Resources\n" + "4.Legal\n");
			i = sc.nextInt();
			switch (i) {
			case 1:
				SDepartment = "Technical";
				break;
			case 2:
				SDepartment = "Admin";
				break;
			case 3:
				SDepartment = "Human Resources";
				break;
			case 4:
				SDepartment = "Legal";
				break;
			default:
				System.out.println("Invalid option selected. Select Valid input.");
				break;
			}
			Employee emp = new Employee(sFname, sLname, SDepartment);
			CredentialService cs = new CredentialService(emp);
			cs.showCreds(cs.generateEmail(), cs.generatePassword());
			System.out.println("Enter 5 to continue or 6 to exit.");
			i = sc.nextInt();
		} while (i > 1 && i < 6);
		System.out.println("Program Finished.");
	}

}
