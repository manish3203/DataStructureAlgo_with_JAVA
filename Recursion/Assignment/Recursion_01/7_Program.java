
/*
 
   Program 7 : WAP to find the factorial of a number.

*/

class Solution {

        int usingforLoop(int N) {

                System.out.println("Using forloop" );
                int fact = 1;

		while(N != 0) {
			
			fact = fact * N;
			N--;
		}
                return fact;
        }
        int usingRecursion(int N) {

                if(N == 1) {

                        return 1;
                }
			
                return N * usingRecursion(--N);

        }
        public static void main(String[] args) {

                Solution obj = new Solution();

                System.out.println("Using recursion ");
                System.out.println(obj.usingRecursion(4));

                System.out.println(obj.usingforLoop(4));
        }
}

