
/*
	23] Maximum subarray sum
	    
	    Given an integer array of size N.
	    Find the contiguos subArray (containing at least one number)
	    which has largest sum and return its sum

	    Input : [-2,1,-3,4,-1,2,1,-5,4]
	    Output : 6

*/

class Solution {
	
	//Approach : 3
	static int prefixSumApproach3(int arr[]) {

		arr[0] = arr[0];
		for(int i=1; i<arr.length; i++) {

			arr[i] = arr[i-1] + arr[i];
		}

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			int sum = 0;
			for(int j=i; j<arr.length; j++) {

				if(i == 0)

					sum = arr[j];
				else

					sum = arr[j] - arr[i-1];

				if(sum > maxSum)

					maxSum = sum;
			}
		}
		return maxSum;
	}
	//Approach : 2
	static int carryforwardSumApproach2(int arr[]) {

                int maxSum = Integer.MIN_VALUE;

                for(int i=0; i<arr.length; i++) {

                        int sum = 0;
                        for(int j=i; j<arr.length; j++) {

                                sum = sum + arr[j];

                                if(sum > maxSum)

                                        maxSum = sum;
                        }
                }
                return maxSum;
        }
	//Approach : 1
	static int bruteForceApproach1(int arr[]) {

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			for(int j=i; j<arr.length; j++) {
				
				int sum = 0;
				for(int k=i; k<=j; k++) {

					sum = sum + arr[k];
				}
				if(sum > maxSum)

					maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {

		int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};

		int maxSum1 = bruteForceApproach1(arr);
		System.out.println("Max sum using normal way : "+maxSum1);           //Time complexity : O(N^3)  Space Complexity : O(1)
				
		int maxSum2 = carryforwardSumApproach2(arr);
		System.out.println("Max sum using carryforward sum : "+maxSum2);     //Time complexity : O(N^2)  Space Complexity : O(1)
		
		int maxSum3 = prefixSumApproach3(arr);
		System.out.println("Max sum using prefix sum : "+maxSum3);           //Time complexity : O(N^2)  Space Complexity : O(1)


	}
}
