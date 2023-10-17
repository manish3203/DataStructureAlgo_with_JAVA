
/*

   print right digonal of 2d metrics

   1  2  3
   4  5  6
   7  8  9

*/

class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

		int i = 0;
		int j = arr.length-1;

		while(i < arr.length && j >= 0) {

			System.out.print(arr[i][j]+"  ");
			i++;
			j--;
		}
		System.out.println();
	}
}
