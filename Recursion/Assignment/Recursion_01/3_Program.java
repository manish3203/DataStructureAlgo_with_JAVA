
/*
 
   Program 3 : WAP to print the sum of n natural numbers.

*/

class Solution {
	
	int usingforLoop(int N) {
		
		System.out.println("Using forloop" );	
		int sum = 0;
		for(int i=1; i<=N; i++) {

			sum = sum + i;
		}
		return sum;
	}
	int usingRecursion(int N) {

		if(N == 1) {

			return 1;
		}

		return N + usingRecursion(--N);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		
		System.out.println("Using recursion ");
		System.out.println(obj.usingRecursion(10));

		System.out.println(obj.usingforLoop(10));
	}
}
