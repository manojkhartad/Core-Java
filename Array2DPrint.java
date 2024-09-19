// Write a program to print 2 dimensional array
public class Array2DPrint {

	public static void main(String[] args) {

			int[][] arr = { { 2, 5, 8 }, { 4, 1, 5 }, { 9, 7, 3 } };
			
			for ( int i = 0; i < arr.length; i++) {
				
				for ( int j = 0; j < arr[0].length; j++) {
					
					System.out.print(arr[i][j] + " ");
					
				}
				System.out.println();
			}
	}

}
