
/*

   Program 3 : First Occurrence of an Element

   	       Modify the binary search function to find the first occurrence of a given element in
	       a sorted array. Return -1 if the element is not present.
	       
	       For example, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element
	       4, the function should return 1, as 4 first appears at index 1 in the array.

*/

class Solution {

       	int recursionApproach(int arr[], int search, int start, int end) {

                if(start <= end) {

			int mid = start + (end-start) / 2;

			if((mid == 0 || search > arr[mid-1]) && (arr[mid] == search)) {

				return mid;
			}else if(arr[mid] >= search) {

				return recursionApproach(arr, search, start, mid-1);
			}else {
				
				return recursionApproach(arr, search, mid+1, end);
			}
		}
		return -1;
        }
	
	int whileLoopApproach(int arr[], int searchEle) {

		int start = 0;
		int end = arr.length-1;
		int tempIndex = -1;

		while(start <= end) {

			int mid = start + (end - start)/2;

			if(arr[mid] > searchEle) {

				end = mid-1;
			}else if(arr[mid] < searchEle) {

				start = mid+1;
			}else {

				tempIndex = mid;
				end = mid-1;
			}
		}

		return tempIndex;
	}
        public static void main(String[] args) {

                int arr[] = new int[] {2, 2, 4, 4, 6, 7, 8};

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

