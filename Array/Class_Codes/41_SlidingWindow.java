
/*

   40] Given an array of size N
       Find the maximum sub array sum of length k

       Input : 
       Arr : [-3,4,-2,5,3,-2,8,2,1,4]

       Sliding Window Concept
*/

import java.util.*;

class SlidingWindow {

	public static void main(String[] args) {

		int arr[] = new int[] {-3,4,-2,5,3,-2,8,2,1,4};
		
		int prefixArr[] = new int[arr.length];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length k : ");
		int k = sc.nextInt();
		
		int start = 0;
		int end = k-1;
		int sum = 0;

		for(int i=start; i<=end; i++) {

			sum = sum + arr[i];
		}

		int max = sum;
		start = 1;
		end = k;

		while(end < arr.length) {
			
			sum = sum - arr[start-1] + arr[end];

			if(sum > max)

				max = sum;

			start++;
			end++;
		}
		System.out.println("Max Sum : "+max);
	}
}


/*
 *	Time Complexity : O(N)
 *	Space Complexity : O(1)
 *
 */
