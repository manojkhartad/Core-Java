/*
 * Write a program to find the prime numbers between X and Y range.
 */
import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number X");
		int x = scan.nextInt();
		System.out.println("Enter a number Y");
		int y = scan.nextInt();
		primeNumber(x , y);
	}

	private static void primeNumber(int x, int y) {
		for(int i = x; i<=y; i++) {
			boolean flag = true;
			for(int j = 2; j<= Math.sqrt(i); j++) {
				if( i % j == 0 ) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i + " : is a prime number");
			}
		}
		
	}
	
}
