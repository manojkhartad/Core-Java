
public class ArraySumOfTwoMatrix {

	public static void main(String[] args) {
		int a[][] = { { 2, 4, 6 }, { 3, 6, 9 } };
		int b[][] = { { 1, 3, 5 }, { 10, 15, 20} };
		// create an array
		int c[][] = new int [a.length][a[0].length];
		for ( int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[i].length; j++) {
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for ( int i = 0; i < c.length; i++) {
			for ( int j = 0; j < c[i].length; j++) {
			
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}

	}
	
}
