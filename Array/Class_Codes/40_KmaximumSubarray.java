
/*

   40] Given an array of size N
       Find the maximum sub array sum of length k

       Input : 
       Arr : [-3,4,-2,5,3,-2,8,2,1,4]

	using prefix sum
*/

import java.util.*;

class KLengthMaxSubArraySum {

	public static void main(String[] args) {

		int arr[] = new int[] {-3,4,-2,5,3,-2,8,2,1,4};
		
		int prefixArr[] = new int[arr.length];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length k : ");
		int k = sc.nextInt();
		
		prefixArr[0] = arr[0];
		for(int i=1; i<arr.length; i++) {

			prefixArr[i] = prefixArr[i-1] + arr[i];
		}

		int end = k-1;
		int max = Integer.MIN_VALUE;
		int start = 0;
		int sum = 0;

		while(end < arr.length) {
			
			if(start == 0) {

				sum = prefixArr[start];
			}else {

				sum = prefixArr[end] - prefixArr[start-1];
			}

			if(sum > max) 

				max = sum;

			start++;
			end++;
		}
		System.out.println("Max sum : "+max);
	}
}

/*
 *	Time Complexity : O(N)
 *	Space Complexity : O(N)
 *
 */
