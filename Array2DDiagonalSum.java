// Write a program to find the sum of diagonal elements in Matrix
import java.util.Scanner;

public class Array2DDiagonalSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns");
		int col = scan.nextInt();
		if(row != col) {
			System.out.println("Not a Square Matrix, so diagonal doesn't exist");
			System.exit(0);
		}
		// Create an array
		int [][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the elements at ["+i+"]["+j+"]");
				arr[i][j] = scan.nextInt();
			}
		}
		findDiagonalSum(arr);
	}

	private static void findDiagonalSum(int[][] arr) {
	
		int ldSum = 0, rdSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) {
					ldSum += arr[i][j];
					
				}
					if(i + j == arr.length-1) {
						rdSum += arr[i][j];
					}
				}
			}
		System.out.println("Sum of left diagonal sum = " + ldSum);
		System.out.println("Sum of right diagonal sum = " + rdSum);
	}

}
