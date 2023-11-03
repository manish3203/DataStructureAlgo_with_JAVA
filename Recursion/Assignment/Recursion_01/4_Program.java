
/*
 
   Program 4 : WAP to print the length of digits in a number.

*/

class Solution {

        int usingforLoop(int N) {

                System.out.println("Using forloop" );
                int count = 0;

		while(N != 0) {
			
			count++;
			N = N/10;
		}
                return count;
        }
        int usingRecursion(int N, int count) {

                if(N == 0) {

                        return count;
                }
		
		count++;		
                return usingRecursion(N/=10, count);

        }
        public static void main(String[] args) {

                Solution obj = new Solution();

                System.out.println("Using recursion ");
                System.out.println(obj.usingRecursion(123,0));

                System.out.println(obj.usingforLoop(123));
        }
}

