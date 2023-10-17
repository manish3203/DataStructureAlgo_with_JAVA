
/*

   print left digonal of 2d metrics

   1  2  3
   4  5  6
   7  8  9

*/

class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0; i<arr.length; i++) {

			System.out.print(arr[i][i]+"  ");
		}
		System.out.println();
	}
}
