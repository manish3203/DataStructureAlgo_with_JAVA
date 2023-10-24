
/*

   34] Given a metrics of size N*M
       print all diagonals (R->L)
       row-> 0th row

*/


class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
		
		for(int i=arr.length; i>=0; i--) {

			int j = 0;
			int y = i;

			while(j<arr.length && y>=0) {

				System.out.print(arr[j][y]+"  ");
				j++;
				y--;
			}
			System.out.println();
		}
	}
}
