
/*
 	11] Array rotation

	    Problem description :
	    -Given an integer array A of size N and an Integer B, you hava return
	     the same array after rotating it B times towards the right.

	     problem constraints :

	     1 <= N <= 10^5
	     1 <= A[i] <= 10^9
	     1 <= B <= 10^9

	     Example Input1 :
	     A[1,2,3,4]
	     B : 2

	     Output 1
	     A[3,4,2,1];

	     Input2
	     A[2,5,6]
	     B : 1

	     Output 1
	     A[6,2,5]

*/

import java.util.*;

class Solution {
	
	static int[] rotateArray(int arr[], int B) {

		int rotation[] = new int[arr.length];
		
		for(int i=0; i<B; i++) {

			for(int j=0; j<arr.length-1; j++) {

				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int N = sc.nextInt();

		int arr[] = new int[N];

		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter how many elements rotating : ");
		int B = sc.nextInt();

		int[] rotateArr = rotateArray(arr,B);
		
		System.out.print("[ ");
		for(int i=0; i<arr.length; i++) {

			System.out.print(rotateArr[i]+", ");
		}
		System.out.println("]");
	}
}	
