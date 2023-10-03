
/*
	2] Given an integer array of size N.
           Count the no of element having at least 1 element greater than itself.
 	
 	   Arr = [2,5,1,4,8,0,8,1,3,8]
  	   N = 10
 	   Output = 7

*/

//Brute force

class Solution {
	
	static int bruteforceApproach(int arr[], int N) {
		
		int count = 0;

		for(int i=0; i<N; i++) {

			for(int j=0; j<N; j++) {

				if(arr[i] < arr[j]) {

					count++;
					break;
				}
			}
		}
		return count;
	}
	static int optimizedApproach(int arr[], int N) {

		int maxEle = Integer.MIN_VALUE;

		//find max
		for(int i=0; i<N; i++) {

			if(maxEle < arr[i]) 

				maxEle = arr[i];
		}

		//count
		int count = 0;

		for(int i=0; i<N; i++) {

			if(maxEle == arr[i]) 

				count++;
		}
		return N-count;

	}
	public static void main(String[] args) {

		int arr[] = new int[] {2,5,1,4,8,0,8,1,3,8};

		int N = 10;
		
		System.out.println(bruteforceApproach(arr,N));
		System.out.println(optimizedApproach(arr,N));
	}
}
