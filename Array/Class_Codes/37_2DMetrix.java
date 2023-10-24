
/*

   37] Given a N*N metrix
       Print the spiral fashion

*/

class Solution {

        public static void main(String[] args) {

                int arr[][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                int j=0;
                int k=0;
		
		int N = arr.length;

		while(N > 1) {
                
			for(int i=0; i<N-1; i++) {

                        	System.out.print(arr[j][k]+"  ");
                        	k++;
                	}
                	for(int i=0; i<N-1; i++) {

                        	System.out.print(arr[j][k]+"  ");
                        	j++;
                	}	
                	for(int i=0; i<N-1; i++) {

                        	System.out.print(arr[j][k]+"  ");
                        	k--;
                	}
                	for(int i=0; i<N-1; i++) {

                        	System.out.print(arr[j][k]+"  ");
                        	j--;
                	}
			N = N-2;
			j++;
			k++;
		}
		if(N == 1)

			System.out.println(arr[j][k]+"  ");

		System.out.println();
        }
}

