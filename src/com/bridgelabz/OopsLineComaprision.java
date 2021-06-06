package com.bridgelabz;

import java.util.Scanner;

public class OopsLineComaprision {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		OopsLineComaprision length = new OopsLineComaprision();
		System.out.println("Enter x1,x2,y1,y2,a1,a2,b1,b2 values");
		toCompareLines(length);
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

	/**
	 * This method is checking if the two lines are equal
	 * 
	 * @param length
	 */
	private static void areLinesEqual(OopsLineComaprision length) {
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		Double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		Double length2 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
		String equalMessage = (length.equals(length1) == true) ? "equal" : "not equal";
		System.out.println("Length of two lines is " + equalMessage);

	}

	/**
	 * This method is comparing two lines if they are equal or less than or greater
	 * than
	 * 
	 * @param length
	 */
	private static void toCompareLines(OopsLineComaprision length) {
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		Double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		Double length2 = Math.sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
		int compareResult = length1.compareTo(length2);
		String compareMessage;
		if (compareResult == 0) {
			compareMessage = "Length of line1 and line2 is equal";
		} else if (compareResult < 0) {
			compareMessage = "Length of line1 is less than line2";
		} else {
			compareMessage = "Length of line1 is greater than line2";
		}
		System.out.println(compareMessage);
	}
}
