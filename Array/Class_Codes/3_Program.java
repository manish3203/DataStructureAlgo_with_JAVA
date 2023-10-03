
/*
	3] Given an array of size N.
	   Return the count of pairs(i,j) with arr[i]+arr[j] = k

	   arr[3,5,2,1,-3,7,8,15,6,13];
	   N : 10
	   K : 10

	   Note : i!=j

	   output = 6;

*/

class Solution {
	
	static int countofPairs(int arr[], int N, int K) {
		
		int count = 0;

		for(int i=0; i<N; i++) {

			for(int j=i+1; j<N; j++) {

				if(arr[i]+arr[j] == K) {

					count++;
				}
			}
		}
		return count*2;
				
	}
	public static void main(String[] args) {

		int arr[] = new int[] {3,5,2,1,-3,7,8,15,6,13};

		int N = 10;
		int K = 10;

		System.out.println(countofPairs(arr,N,K));
	}
}
