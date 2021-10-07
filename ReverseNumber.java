package com.logical.programs;

// To Reverse a Enter Number

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		// Declare and Initialize Reverse Variable
		int reverse = 0;
		// number should be Greater than Zero
		while (number != 0) {
			int reminder = number % 10;
			reverse = (reverse * 10) + reminder;
			number = number / 10;
		}
		// Print Reverse Number
		System.out.println("Reverse Number is: " + reverse);
	}

}
