
/*

   39] Given an array of size N
       Find the maximum sub array sum of length k

       Input : 
       Arr : [-3,4,-2,5,3,-2,8,2,1,4]


*/

import java.util.*;

class KLengthMaxSubArraySum {

	public static void main(String[] args) {

		int arr[] = new int[] {-3,4,-2,5,3,-2,8,2,1,4};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length k : ");
		int k = sc.nextInt();

		int end = k-1;
		int max = Integer.MIN_VALUE;
		int start = 0;

		while(end < arr.length) {
			int sum = 0;
			for(int i=start; i<=end; i++) {

				sum = sum + arr[i];
			}
			if(sum > max) {
				
				max = sum;
			}

			start++;
			end++;
		}

		System.out.println("Max sum : "+max);
	}

}

/*
 *
 *	Time Complexity : O(N^2)
 *	Space Complexity : O(1)
 *
 */
