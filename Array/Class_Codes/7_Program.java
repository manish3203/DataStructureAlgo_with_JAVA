
/*
	7] range sum

*/

import java.util.*;

class Solution {
	
	static int rangeSum(int arr[], int start, int end) {

		int sum = 0;
		for(int i=start; i<=end; i++) {

			sum = sum + arr[i];
		}
		return sum;
	}	
	public static void main(String[] args) {

		int arr[] = new int[] {2,5,3,11,7,9};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number : ");
		int start = sc.nextInt();

		System.out.println("Enter ending number : ");
		int end = sc.nextInt();

		int sum = rangeSum(arr, start, end);

		System.out.println("Sum : "+sum);
	}
}
