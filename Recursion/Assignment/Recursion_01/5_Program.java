
/*
 
   Program 5 : WAP to check whether the number is prime or not.

*/

class Solution {

        void usingforLoop(int N) {

                System.out.println("Using forloop" );
            	int count = 0;

		for(int i=1; i<=N; i++) {

			if(N%i == 0)

				count++;
		}

		if(count == 2)

			System.out.println("The given number is prime ");
		else

			System.out.println("The given number is not prime ");
        }
        int usingRecursion(int N, int i) {

                if(N < i) {

                        return 0;
                }
		
		return((N%i == 0) ? 1:0) + usingRecursion(N, ++i);

        }
        public static void main(String[] args) {

                Solution obj = new Solution();

                System.out.println("Using recursion ");
                if(obj.usingRecursion(7,1) == 2)

			System.out.println("The given number is prime ");
		else

			System.out.println("The given number is not prime ");


                obj.usingforLoop(7);
        }
}

