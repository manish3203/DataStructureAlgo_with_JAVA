
/*
 
   Program 6 : WAP to calculate the sum of digits of a given positive integer.

*/

class Solution {

        int usingforLoop(int N) {

                System.out.println("Using forloop" );
                int sum = 0;

		while(N != 0) {
			
			sum = sum + N%10;	
			N = N/10;
		}
                return sum;
        }
        int usingRecursion(int N) {

                if(N == 0) {

                        return 0;
                }
				
                return N%10 + usingRecursion(N/=10);

        }
        public static void main(String[] args) {

                Solution obj = new Solution();

                System.out.println("Using recursion ");
                System.out.println(obj.usingRecursion(12345));

                System.out.println(obj.usingforLoop(12345));
        }
}

