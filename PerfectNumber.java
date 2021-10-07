package com.logical.programs;

/*
 *  To Check Whether Number is Perfect or Not
 */

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		// Declared and Initialize Sum Variable
		int sum = 0;
		// Check Condition and Sum
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is perfect number");
		} else {
			System.out.println(number + " is not perfect number");
		}
	}

}
