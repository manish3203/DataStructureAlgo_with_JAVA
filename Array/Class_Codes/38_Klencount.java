
/*

   38] K-len sub array count

*/

import java.util.*;

class kLengthSubArrayCount {

	public static void main(String[] args) {

		int arr[] = new int[] {-3,4,-2,5,3,-2,8,2,1,4};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of k : ");
		int k = sc.nextInt();
		
		int count = 0;

		for(int i=k-1; i<arr.length; i++) {

			count++;
		}

		System.out.println("Count : "+count);
	}
}

/*
 *
 *	Time Complexity : O(N)
 *	Space Complexity : O(1)
 *
 */
