/*
        25] Maximum subarray print
            
            Given an integer array of size N.
            Find the contiguos subArray (containing at least one number)
            which has largest sum then print subarray

            Input : [-2,1,-3,4,-1,2,1,-5,4]
            Output : [4,-1,2,1]

*/

class Solution {
	
	static void secondApproach(int arr[]) {

		int maxSum = Integer.MIN_VALUE;

		int startIndex = 0;
		int endIndex = 0;
		int sum = 0;
		
		System.out.println("Approach 2 : ");
		for(int i=0; i<arr.length; i++) {

			sum = sum + arr[i];

			if(sum > maxSum) {

				maxSum = sum;
				endIndex = i;
			}

			if(sum < 0) {

				sum = 0;
				startIndex = i+1;
			}
		}

		for(int i=startIndex; i<=endIndex; i++) {

			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	static void firstApproach(int arr[]) {

                int sum= 0;

		int startIndex = -1;
		int endIndex = -1;
		int x = -1;

                int maxSum = Integer.MIN_VALUE;
		
		System.out.println("Approach 1 : ");
                for(int i=0; i<arr.length; i++) {
			
			if(sum == 0)

				x = i;

                        sum = sum + arr[i];
			
                        if(sum > maxSum) {

                                maxSum = sum;
				startIndex = x;
				endIndex = i;
			}	
	     
			if(sum < 0)

                                sum = 0;
		}

		for(int i=startIndex; i<=endIndex; i++) {

			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
        public static void main(String[] args) {

                int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		
		firstApproach(arr);
		secondApproach(arr);
                
        }
}

/*

   Time Complexity : O(N)
   Space Complexity : O(1)

*/
