
/*
 	8] Given an array of size N and Q number of queries.
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

*/

import java.util.*;

class Solution {

	public static void main(String[] args) {

		int N = 10;
		int Q = 3;

		int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<Q; i++) {
			
			int sum = 0;

			int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();

			for(int j=startIndex; j<=endIndex; j++) {

				sum = sum + arr[j];
			}
			System.out.println("Start : "+startIndex+" End : "+endIndex+" Sum :- "+sum);
		}
	}
}
