
/*
 	12] range max number find

*/

import java.util.*;

class Solution {
	
	static int rangeMax(int arr[], int range) {

		int max = Integer.MIN_VALUE;

		for(int i=0; i<=range; i++) {

			if(arr[i] > max) {

				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<size; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a range : ");
		int range = sc.nextInt();

		int maxNum = rangeMax(arr,range);

		System.out.println("Range Max : "+maxNum);
	}
}
