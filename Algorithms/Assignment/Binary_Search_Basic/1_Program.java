
/*

   Program 1 : WAP for binary search using recursion as well as while loop approach.

*/

class Solution {
	
	int recursionApproach(int arr[], int search, int start, int end) {
	
		if(start > end) {

			return -1;
		}else {

			int mid = (start+end) / 2;

			if(arr[mid] == search)

				return mid;

			if(arr[mid] < search) {

				return recursionApproach(arr, search, mid+1, end);
			}else {

				return recursionApproach(arr, search, start, mid-1);
			}
		}
	}

	int whileLoopApproach(int arr[], int search) {
		
		int start = 0;
		int end = arr.length-1;

		while(start <= end) {

			int mid = (start+end) / 2;

			if(arr[mid] == search)

				return mid;

			if(arr[mid] < search)

				start = mid+1;

			if(arr[mid] > search)

				end = mid-1;

		}
		return -1;

	}
	public static void main(String[] args) {

		int arr[] = new int[] {4,9,15,18,34,65,98};

		Solution obj = new Solution();

		int searchEle = 9;
		
		//using while loop
		int elementSearch1 = obj.whileLoopApproach(arr, searchEle);

		if(elementSearch1 == -1)

			System.out.println("Element not found. ");
		else

			System.out.println("Element found. ");

		//using recursion
		int start = 0, end = arr.length-1;
		int elementSearch2 = obj.recursionApproach(arr, searchEle, start, end);
		
		if(elementSearch2 == -1)

			System.out.println("Element not found. ");
		else

			System.out.println("Element found. ");
	}
}
