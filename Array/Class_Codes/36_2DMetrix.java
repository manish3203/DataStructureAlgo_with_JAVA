
/*

   36] Given a N*N matrix 
       print the boundry in clockwise fashion

*/

class Solution {

	public static void main(String[] args) {

		int arr[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		int j=0;
		int k=0;

		for(int i=0; i<arr[i].length-1; i++) {

			System.out.print(arr[j][k]+"  ");
			k++;
		}
		for(int i=0; i<arr[i].length-1; i++) {

			System.out.print(arr[j][k]+"  ");
			j++;
		}
		for(int i=0; i<arr[i].length-1; i++) {

			System.out.print(arr[j][k]+"  ");
			k--;
		}
		for(int i=0; i<arr[i].length-1; i++) {

			System.out.print(arr[j][k]+"  ");
			j--;
		}
		System.out.println();
	}
}

