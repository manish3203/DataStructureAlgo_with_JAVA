
/*
	21] Given an array of size N.
	    int arr[] = new int[] {2,4,1,3};
	   
	    Approach_1 : Print the sum of every single sub array

	    Approach_2 : Print the sum of every single subarray using prefix 
	    		 sum technlogy.

	    Approach_3 : print the sum of every single subarray using caaryforwrd.


*/


class Solution {
	
	//Approach_4 : prefixsum without extra space
	void prefixsumWithoutSpace(int arr[]) {

		arr[0] = arr[0];
		for(int i=1; i<arr.length; i++) {

			arr[i] = arr[i-1] + arr[i];
		}

		System.out.println("Approach_4 : PrefixSum without extra space way ");
		for(int i=0; i<arr.length; i++) {

			for(int j=i; j<arr.length; j++) {

				if(i == 0)

					System.out.println(arr[j]);
				else

					System.out.println(arr[j] - arr[i-1]);
			}
		}

	}
		
	//Approach_3
	void carryForward(int arr[]) {

		System.out.println("Approach_3 : CarryForward way ");
		for(int i=0; i<arr.length; i++) {
			
			int sum = 0;
			for(int j=i; j<arr.length; j++) {

				sum = sum + arr[j];
				System.out.println(sum);
			}
		}
	}

	//Approach_2
	void prefixsumSub(int arr[]) {

		int prefixSum[] = new int[arr.length];

		prefixSum[0] = arr[0];
		for(int i=1; i<arr.length; i++) {

			prefixSum[i] = prefixSum[i-1] + arr[i];
		}

		System.out.println("Approach_2 : PrefixSum way ");
		for(int i=0; i<arr.length; i++) {

			for(int j=i; j<arr.length; j++) {

				if(i == 0)

					System.out.println(prefixSum[j]);
				else

					System.out.println(prefixSum[j] - prefixSum[i-1]);
			}
		}

	}

	//Approach_1
	void sumSubArray(int arr[]) {
		
		System.out.println("Approach_1 : Normal way ");
		for(int i=0; i<arr.length; i++) {

			for(int j=i; j<arr.length; j++) {
				
				int sum = 0;
				for(int k=i; k<=j; k++) {

					sum = sum + arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = new int[] {2,4,1,3};

		Solution obj = new Solution();

		//Approach_1 : normal sum
		obj.sumSubArray(arr);                         //Time Complexity : O(N^3)   Space Complexity : O(1)

		//Approach_2 : prefixSum
		obj.prefixsumSub(arr);                       //Time Complexity : O(N^2)    Space Complexity : O(N)

		//Approach_3 : carryForward
		obj.carryForward(arr);                       //Time Complexity : O(N^2)    Space Complexity : O(1)
		
		//Approach_4 : prefixSum
		obj.prefixsumWithoutSpace(arr);              //Time Complexity : O(N^2)    Space Complexity : O(1)
	}
}
