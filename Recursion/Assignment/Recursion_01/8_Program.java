
/*

   Program 8 : WAP to count the occurrence of a specific digit in a given number.

*/

class Solution {
	
	int usingforLoop(int N, int search) {
		
		int count = 0;
		while(N != 0) {

			int rem = N%10;

			if(search == rem)
				count++;

			N/=10;
		}
		return count;
	}
	int usingRecursion(int N, int search) {

		if(N == 0) {
			
			return 0;
		}

		return ((N%10 == search) ?1 : 0) + usingforLoop(N/=10, search);

	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		
		System.out.println("Using recursion ");
		System.out.println(obj.usingRecursion(577244,4));

		System.out.println("Using forloop");
		System.out.println(obj.usingforLoop(577244,4));
	}
}
