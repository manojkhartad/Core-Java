import java.util.Scanner;

public class Array2DSum {

	public static void main(String[] args) {
		
		//int arr[][] = { { 2, 5, 6 }, { 4, 1, 7, 3 }, { 9, 5, 3 }, { 7, 8 } };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns");
		int cols = scan.nextInt();
		// Create an array
		
		int[][] arr = new int[rows][cols];
		for ( int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr[0].length; j++) {
				System.out.println("Enter the elements at [" + i + "][" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		findSum(arr);
	}
	
	
	private static void findSum(int[][] arr) {
		
		int sum = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 0; j < arr[i].length; j++ ) {
				sum = sum + arr[i][j];
			}
			//System.out.println("Sum = " + sum);
		}
		System.out.println("Sum = " + sum);

	}

}
