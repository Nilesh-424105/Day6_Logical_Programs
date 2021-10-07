package com.logical.programs;

/*
 * Write a StopWatch Program for measuring the time that elapses between
 *       the start and end clicks
 */

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		// User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Start the watch");
		long startWatch = System.currentTimeMillis();
		sc.nextFloat();

		System.out.println("Enter 2 to Stop the watch");
		long stopWatch = System.currentTimeMillis();
		sc.nextFloat();

		// To Calculate Elapse Time
		long elapseTime = stopWatch - startWatch;
		System.out.println("Elapse Time is: " + elapseTime);
	}

}
