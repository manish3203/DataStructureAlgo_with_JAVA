
/*
	19] Given an array of size N.
	    print all the elements in a given sub array
	    start to end

*/

class Solution {

	public static void main(String[] args) {

		int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};

		int start = 3;
		int end = 7;

		for(int i=start; i<=end; i++) {

			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
