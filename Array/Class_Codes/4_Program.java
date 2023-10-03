
/*
	4] Reverse array using extra space or without extra space

*/


class Solution {
	
	void reverseWithoutSpace(int arr[]) {

		int start = 0;
		int end = arr.length-1;

		while(start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void reverseExtraSpace(int arr[]) {

		int reverse[] = new int[arr.length];
		int itr = arr.length-1;

		for(int i=0; i<arr.length; i++) {

			reverse[i] = arr[itr];
			itr--;
		}
		for(int i=0; i<reverse.length; i++) {

			System.out.print(reverse[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		int arr[] = new int[] {8,4,1,3,9,2,6,7};

		Solution obj = new Solution();
		
		obj.reverseExtraSpace(arr);

		obj.reverseWithoutSpace(arr);
	}
}
