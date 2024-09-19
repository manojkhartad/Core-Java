// Write a program to find sum of given array
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();
		// create an array
		int arr[] = new int[n];
		for(int i = 0; i < n; i++ ) {
			System.out.println("Enter the value at index: " + i);
			arr[i] = scan.nextInt();
		}
		findSum(arr); // Calling method
	}
	private static void findSum(int arr[]) { //  Method Defination
		int sum = 0;
		for ( int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of Array value is" + " " + sum);
	}

}
