/*
        24] Maximum subarray sum
            
            Given an integer array of size N.
            Find the contiguos subArray (containing at least one number)
            which has largest sum and return its sum

            Input : [-2,1,-3,4,-1,2,1,-5,4]
            Output : 6

*/

class Solution {

	public static void main(String[] args) {

		int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum= 0;

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			sum = sum + arr[i];

			if(sum > maxSum) 

				maxSum = sum;

			if(sum < 0)

				sum = 0;
		}

		System.out.println("Sum using kadane's algorithm : "+maxSum);
	}
}

/*

   Time Complexity : O(N)
   Space Complexity : O(1)

*/
