/*
 * Write a program to find the perfect number in a given rage of x & Y
 * Perfect number is a sum of factors is equal to the same number excluding the given number.
 * ex: 6 = 1+2+3
 *       = 6 is a prime number
 */

import java.util.Scanner;

public class perfectNumberRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number x");
		int x = scan.nextInt();
		System.out.println("Enter a number y");
		int y = scan.nextInt();
		perfectNumber(x , y);
		
	}
	private static void perfectNumber(int x , int y) {
		
		for(int i=x; i<=y; i++) {
			int sum = 0;
			for(int j = 1; j<i; j++) {
				if ( i % j == 0) {
					sum = sum + j;
				}	
			}
			if ( sum == i ) 
				System.out.println(i + ": is a perfect number");
			else
				System.out.println(i + ": is not a perfect number");
		}
	}
}


