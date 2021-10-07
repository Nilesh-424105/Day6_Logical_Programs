package com.logical.programs;

/*
 *  Fibonacci Series
 */

public class FibonacciSeries {
	public static void main(String[] args) {

		// Declared and Assigned And Print Variables
		int number1 = 0;
		System.out.print(" " + number1);
		int number2 = 1;
		System.out.print(" " + number2);

		// To get third Number By sum of Previous Two Numbers
		for (int i = 2; i <= 10; i++) {
			int sum = number1 + number2;
			number1 = number2;
			number2 = sum;
			System.out.print(" " + sum);
		}
	}

}
