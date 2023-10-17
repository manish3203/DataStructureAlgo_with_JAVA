
/*

   print sum of entire matrix

   1  2  3  4
   5  6  7  8
   9  10 11 12

*/

class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int sum = 0;

		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {

				sum = arr[i][j]+sum;
			}
		}
		System.out.println(sum);
	}
}
