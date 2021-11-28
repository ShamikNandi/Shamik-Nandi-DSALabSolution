package com.gl.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {
	private Employee emp;

	public CredentialService(Employee emp) {
		super();
		this.emp = emp;
	}

	public String generateEmail() {
		return emp.getsFname() + emp.getsLname() + "@" + emp.getsDepartmentName() + ".greatlearning.com";
	}

	public String generatePassword() {
		String sCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sSmallLetter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+=/.?<>";
		String Value = sCapitalLetters + sSmallLetter + numbers + specialCharacters;
		Random rn = new Random();
		List<Character> sPassword = new ArrayList<>();
		sPassword.add(sCapitalLetters.charAt(rn.nextInt(sCapitalLetters.length())));
		sPassword.add(sSmallLetter.charAt(rn.nextInt(sSmallLetter.length())));
		sPassword.add(numbers.charAt(rn.nextInt(numbers.length())));
		sPassword.add(specialCharacters.charAt(rn.nextInt(specialCharacters.length())));
		for (int i = 4; i < 8; i++) {
			sPassword.add(i, Value.charAt(rn.nextInt(Value.length())));
		}
		Collections.shuffle(sPassword);
		String pass = sPassword.toString();
		pass = pass.substring(1, 3 * sPassword.size() - 1);
		pass = pass.replace(" ", "");
		pass = pass.replace(",", "");
		return pass;
	}

	public void showCreds(String EmailID, String Password) {
		System.out.println(emp.getsFname() + " this is your emailID and Password respectively:\n" + "EmailID:: "
				+ EmailID + "\nPassword:: " + Password);
	}
}
