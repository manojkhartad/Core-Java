import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scan.nextInt();
		isPalindrome(num);
	}
	private static void isPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		while(num > 0) {
			int r = num % 10;
			reverse = reverse * 10 + r;
			num /= 10;
		}
		if (temp == reverse) {
			System.out.println(reverse + ": is a palindrome number");
		}
		else {
			System.out.println(reverse + ": is not a palindrome number");
		}
	}

}
