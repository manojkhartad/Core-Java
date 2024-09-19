import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n = scan.nextInt();
		printPattern(n);
		scan.close();
	}
	private static void printPattern(int n) {
		for(int i = 0; i <= n-1; i++) {
			// inner loop1 for spaces
			for(int j = 1; j <= n - i - 1; j++) {
				System.out.print(" "); // 1 space
			}
			// inner loop2 for values
			for( int j = 0; j <= i; j++) {
				System.out.print(ncr(i , j) + " ");
			}
			System.out.println();
		}
	}
	private static int ncr( int i, int j) {
		
		return factorial(i)/(factorial(i-j) * factorial(j)); // formula of ncr = n!/(n-r)! * r!
	}
	private static int factorial(int i) {
		int fact = 1;
		for(int k = 1; k <= i; k++) {
			fact = fact * k;
		}
		return fact;
	}
	

}
