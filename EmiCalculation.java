import java.util.Scanner;

public class EmiCalculation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		double p = scan.nextDouble();
		
		System.out.println("Enter the rate of interest");
		double pa = scan.nextDouble();
		
		System.out.println("Enter the tenure in months");
		int n = scan.nextInt();
		
		// converting rate of interest from per annum to per month
		double r = pa / 12 / 100;
		
		double x = Math.pow(1 + r, n);
		
		double emi = p * r * x / (x - 1);
		System.out.println("EMI is: " + emi);
		
	}

}
