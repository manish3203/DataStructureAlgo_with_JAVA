
//using recursion


import java.util.*;

class BinarySearchUsingRecursion {
	
	static int binarySearch(int arr[], int search, int start, int end) {

		if(start > end) {

			return -1;
		}else {
			
			int mid = (start+end)/2;

			if(search == arr[mid]) {

				return mid;
			}else if(search > arr[mid]) {

				return binarySearch(arr, search, mid+1, end);
			}else {

				return binarySearch(arr, search, start, mid-1);
			}
		}
	}
	public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[] {4,7,11,24,35,57,75};

                System.out.println("Enter search element : ");
                int search = sc.nextInt();

		int start = 0, end = arr.length-1;

                int index = binarySearch(arr, search, start, end);

                if(index == -1)

                        System.out.println("Element not found. ");
                else

                        System.out.println("Element found at index : "+index);
        }

}
