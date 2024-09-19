import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n = scan.nextInt();
		System.out.println("Enter the searching element");
		int k = scan.nextInt();
		
		int arr[] = new int[n];
		
		for( int i = 0; i < n; i++) {
			System.out.println("Enter the array elements");
			arr[i] = scan.nextInt();
		}
		binarySearchArray(arr, k);
	}
	private static void binarySearchArray(int arr[], int k) {
		Arrays.sort(arr);
		int low = 0, high = arr.length-1;
		boolean found = false;
		while( low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == k) {
				System.out.println("Element is found");
				found = true;
				break;
			}
			else if (arr [mid] < k) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		if(found == false) {
			System.out.println("Element is not found");
		}
	}
}
