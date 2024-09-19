/*
 * Write a program to find sum of odd and even position of array separately
 * by reading array size and elements from user.
 */

import java.util.Scanner;

public class ArraySumOfOddEvenPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for ( int i = 0; i < n; i++) {
			System.out.println("Enter the value at index" + i);
			arr[i] = scan.nextInt();
		}
		sumOfOddEvenPosition(arr);
		
	}

	private static void sumOfOddEvenPosition(int[] arr) {
		int evenSum = 0, oddSum = 0;
		for ( int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
			
			
		}
		System.out.println("Sum of even position elements is: " + evenSum);
		System.out.println("Sum of odd position elements is: " + oddSum);
		
		
	}

}
