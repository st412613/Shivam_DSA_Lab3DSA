package com.gl.driver;

import java.util.Scanner;

import com.gl.model.BracketBalanceValidation;

public class Main {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the valid Brackets:");
			String brace = sc.nextLine();
			test(brace);

		

	}

	static void test(String brackets) {

		BracketBalanceValidation checker = new BracketBalanceValidation(brackets);

		boolean result = checker.check();
		if (result) {
			System.out.println("The entered String " + brackets + " has Balanced Brackets. ");
		} else {
			System.out.println("The entered Strings " + brackets + " do not contain Balanced Brackets. ");
		}
	}
	
}
