import java.util.Scanner;

public class FibonaccieSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		fibonaccieSeries(n);
	}
	private static void fibonaccieSeries(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm = 0;
		while(nextTerm <= n) {
			if(n == 1)
			
				System.out.println(firstTerm);
			
			else if (n == 2) {
				
				System.out.println(firstTerm);
				System.out.println(secondTerm);
			
			}
			
			else {
				
				
				for(int i = 3; i <= n; i++) {
					System.out.println(firstTerm);
					System.out.println(secondTerm);
					nextTerm = firstTerm + secondTerm;
					firstTerm = secondTerm;
					secondTerm = nextTerm;
				}
				
			}
		}
	}

}
