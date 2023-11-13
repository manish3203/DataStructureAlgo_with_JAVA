
/*

   Program 2 : Given a sorted array of size N and an integer K, find the position(0-based

   	       indexing) at which K is present in the array using binary search.
	
	       Example 1:
	
	       Input:
	       N = 5
	       arr[] = {1 2 3 4 5}
	       K = 4
	       Output: 3
	       Explanation: 4 appears at index 3.


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

                int arr[] = new int[] {1, 2, 3, 4, 5};

                Solution obj = new Solution();

                int searchEle = 4;

                //using while loop
                int elementSearch1 = obj.whileLoopApproach(arr, searchEle);

                if(elementSearch1 == -1)

                        System.out.println("Element not found. ");
                else

                        System.out.println(searchEle+" appears at index "+elementSearch1);

                //using recursion
                int start = 0, end = arr.length-1;
                int elementSearch2 = obj.recursionApproach(arr, searchEle, start, end);

                if(elementSearch2 == -1)

                        System.out.println("Element not found. ");
                else

         		System.out.println(searchEle+" appears at index "+elementSearch2);
         
  	}
}
