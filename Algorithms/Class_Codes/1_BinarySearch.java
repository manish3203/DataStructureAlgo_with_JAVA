
import java.util.*;

class BinarySearch {
	
	static int binarySearch(int arr[], int search) {

		int start = 0;
		int end = arr.length-1;

		while(start <= end) {

			int mid = (start+end)/2;

			if(search == arr[mid])

				return mid;

			if(search > arr[mid])

				start = mid+1;

			if(search < arr[mid])

				end = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[] {4,7,11,24,35,57,75};

		System.out.println("Enter search element : ");
		int search = sc.nextInt();

		int index = binarySearch(arr, search);

		if(index == -1)

			System.out.println("Element not found. ");
		else

			System.out.println("Element found at index : "+index);
	}
}


/*
 *	Time Complexity = O(log n)
 *
 */
