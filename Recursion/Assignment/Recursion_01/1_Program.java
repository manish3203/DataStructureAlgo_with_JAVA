
/*
 
   Program 1 : WAP to print the numbers between 1 to 10

*/

class Solution {
	
	void usingforLoop(int num) {
		
		System.out.println("Using for loop");
		for(int i=1; i<=num; i++) {

			System.out.println(i);
		}
	}
	void usingRecursion(int num) {

		if(num == 0)
			return;
		
		usingRecursion(--num);
		System.out.println(num+1);

	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		
		System.out.println("Using recursion ");
		obj.usingRecursion(10);

		obj.usingforLoop(10);
	}
}
