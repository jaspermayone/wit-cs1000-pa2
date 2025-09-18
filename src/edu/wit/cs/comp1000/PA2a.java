package edu.wit.cs.comp1000;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Jasper Mayone <mayonej@wit.edu>
 * W00433490
 * 
 * Solution to PA2a
 * 
 */
public class PA2a {
	/** 
	 * Takes in 
	 * and computes 
	 * @param args Not used
	 */
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five whole numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int[] nums = { a, b, c, d, e };

        int posCount = 0;
        int nonPosCount = 0;
        for (int n : nums) {
            if (n > 0) posCount++;
            else nonPosCount++;
        }

        int posSum = Arrays.stream(nums).filter(n -> n > 0).sum();
        int nonPosSum = Arrays.stream(nums).filter(n -> n <= 0).sum();
        int MDS = posSum + nonPosSum;

        double posAvg = (posCount > 0) ? (posSum / (double) posCount) : 0.0;
        double nonPosAvg = (nonPosCount > 0) ? (nonPosSum / (double) nonPosCount) : 0.0;
        double allAvg = MDS / 5.0;

        String posWord = (posCount == 1) ? "number" : "numbers";
        String nonPosWord = (nonPosCount == 1) ? "number" : "numbers";

        System.out.printf("The sum of the %d positive %s: %d%n", posCount, posWord, posSum);
        System.out.printf("The sum of the %d non-positive %s: %d%n", nonPosCount, nonPosWord, nonPosSum);
        System.out.printf("The sum of the %d numbers: %d%n", 5, MDS);
        System.out.printf("The average of the %d positive %s: %.2f%n", posCount, posWord, posAvg);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", nonPosCount, nonPosWord, nonPosAvg);
        System.out.printf("The average of the %d numbers: %.2f%n", 5, allAvg);

        input.close();
    }
}
