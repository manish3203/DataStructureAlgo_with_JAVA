
/*
        9] Given an array of size N and Q number of queries.
           Queries contains two parameters (s,e)
           s->startIndex  e->endindex
           for all queries, print the sum of all elements from index s to index e.

           arr[-3,6,2,4,5,2,8,-9,3,1]
           N : 10
           Q : 3

           Queries  s  e  sum

           query 1  1  3  12

           query 2  2  7  12

           query 3  1  1  6

	   (Using prefix sum)

*/

import java.util.*;

class Solution {
	
	void prefixSum(int arr[], int N, int Q) {

		int psArr[] = new int[N];

		Scanner sc = new Scanner(System.in);

		psArr[0] = arr[0];
		for(int i=1; i<N; i++) {

			psArr[i] = psArr[i-1] + arr[i];
		}
		int sum = 0;
		for(int i=0; i<Q; i++) {

			int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();

			if(startIndex == 0) {

				sum = psArr[0];
			}else {

				sum = psArr[endIndex] - psArr[startIndex-1];
			}
			System.out.println("start : "+startIndex+" end : "+endIndex+" Sum : "+sum);
		}
	}
	public static void main(String[] args) {

		int N = 10;
		int Q = 3;

		int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};

		Solution obj = new Solution();

		obj.prefixSum(arr,N,Q);
	}
}


