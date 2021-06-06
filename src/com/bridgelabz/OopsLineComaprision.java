package com.bridgelabz;

import java.util.Scanner;

public class OopsLineComaprision {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		OopsLineComaprision length = new OopsLineComaprision();
		System.out.println("Enter x1,x2,y1,y2 values");
		calculateLength(length);
	}

	/**
	 * This method is used to calculate the length of a line
	 * 
	 * @param length
	 */
	private static void calculateLength(OopsLineComaprision length) {
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("length is " + length1);
	}
}
