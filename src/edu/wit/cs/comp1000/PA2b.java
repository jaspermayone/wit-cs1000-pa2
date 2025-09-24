package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Jasper Mayone <mayonej@wit.edu>
 * W00433490
 * 
 * Solution to PA2b
 * 
 */
public class PA2b {
	/** 
	 * Takes in values a, b, c for the equation ax^2 + bx + c = 0
	 * and finds the solutions
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read the three numbers from user
		System.out.print("Enter a b c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		// Calculate d = b^2 - 4ac
		double d = b * b - 4 * a * c;
		
		// Check what kind of solutions we have
		if (d < 0) {
			// When d is negative: no real solutions
			System.out.println("Roots: imaginary");
		} else if (d == 0) {
			// When d is exactly zero: one solution
			double root = -b / (2 * a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			// When d is positive: two solutions
			double sqrtD = Math.sqrt(d);
			double root1 = (-b - sqrtD) / (2 * a);
			double root2 = (-b + sqrtD) / (2 * a);
			
			// Make sure we print the smaller number first
			if (root1 > root2) {
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
		
		scanner.close();
	}
}