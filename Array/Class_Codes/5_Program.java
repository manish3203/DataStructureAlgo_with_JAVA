
/*
	5] 2nd largest element in array

*/


class Solution {
	
	static int secondMaxEle(int arr[]) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			if(arr[i] > max1) {

				max2 = max1;
				max1 = arr[i];
			} else if(arr[i] > max2 && max1 != arr[i]) {

				max2 = arr[i];
			}
		}
		return max2;
	}
	public static void main(String[] args) {

		int arr[] = new int[] {1,5,4,6,3};
		
		int max = secondMaxEle(arr);

		System.out.println(max);
	}
}
