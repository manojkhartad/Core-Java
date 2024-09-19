import java.util.Scanner;

public class OddEvenPositionSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		oddEvenPosition(num);
	}
	private static void oddEvenPosition(int num) {
		String str = String.valueOf(num);
		int len = str.length();
		boolean flag = false;
		int evenPositionSum = 0, oddPositionSum = 0;
		
		if(len % 2 == 0) {
			flag = true;
		}
			while(num > 0) {
				int r = num % 10;
				if(flag == true) {
					evenPositionSum += r;
					flag = false;
				}
				else {
					oddPositionSum += r;
					flag = true;
				}
				num = num / 10;
			}
			
			System.out.println("Even position digit sum :" + evenPositionSum);
			System.out.println("Odd position digit sum :" + oddPositionSum);	
		}
			
	}
