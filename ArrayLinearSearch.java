/*
 * Write a program to search for an element in the array, by reading array size, element and 
 * the searching element from the user, using linear search.
 * 
 * Linear Search: It means, compare the searching elements with the every element of the array. 
 * 					If any element of the array is matched, then element is found. Otherwise 
 * 					element is not found.
 * 					
 */

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();
		// Create an Array
		int arr [] = new int[n];
		for ( int i = 0; i < n; i++) {
			System.out.println("Enter the elements at index" + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the searching element");
		int k = scan.nextInt();
		
		linearSearch(arr, k);
	}

	private static void linearSearch(int[] arr, int k) {
		boolean found = false;
		for( int i = 0; i < arr.length; i++ ) {
			if(k == arr[i]) {
				found = true;
				System.out.println("Element found at index" + i);
				break;	
			}
			
		}
		
		if(found == false) {
			System.out.println(" Element is not found in the array !!!");
			}
	}

}
