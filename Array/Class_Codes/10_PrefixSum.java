
/*
	10] In place prefix sum
	    
	    Problem Description :-

	    Given an array A of N Integer
	    construct prefix sum of the array in the given array itself.
	    Return an array of integers denoting the prefix sum of the given array

	    Problem statement :-

	    1 <= N <= 10^5
	    1 <= A[i] <= 10^3

	    Example Input :-

	    Input1
	    A[1,2,3,4,5]
	    Output1
	    [1,3,6,10,15]

	    Input2
	    A[4,3,2]
	    [4,7,9]

*/

import java.util.*;

class Solution {
	
	static int[] prefixSum(int arr[]) {

		arr[0] = arr[0];

		for(int i=1; i<arr.length; i++) {

			arr[i] = arr[i-1] + arr[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of an array : ");
		int N = sc.nextInt();

		int arr[] = new int[N];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		int[] updatArr = prefixSum(arr);
		
		System.out.print("[ ");
		for(int i=0; i<arr.length; i++) {

			if(i==arr.length-1) {

				System.out.print(arr[i]+" ]");
			}else{

				System.out.print(arr[i]+", ");
			}
		}
		System.out.println();
	}
}
