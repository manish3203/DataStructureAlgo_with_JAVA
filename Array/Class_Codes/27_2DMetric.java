
/*

   print 2D Metrics col by col

   1  5  9
   2  6  10
   3  7  11
   4  8  12

*/

class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i=0; i<arr[0].length; i++) {

			for(int j=0; j<arr.length; j++) {

				System.out.print(arr[j][i]+"  ");
			}
			System.out.println();
		}
	}
}
