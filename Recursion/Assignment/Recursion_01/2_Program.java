
/*

   Program 2 : WAP to display the first 10 natural numbers in reverse order.

*/

class Solution {
	
	void usingforLoop(int num) {

		System.out.println("Using for loop ");
		for(int i=num; i>0; i--) {

			System.out.println(i);
		}
	}
	void usingRecursion(int num) {

		if(num == 0) {

			return;
		}

		System.out.println(num);
		usingRecursion(--num);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		
		System.out.println("Using recursion : ");
		obj.usingRecursion(10);
		
		obj.usingforLoop(10);
	}
}
