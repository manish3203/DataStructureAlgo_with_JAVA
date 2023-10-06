
/*
    13] Given an integer array of size N.
        Build an array leftmax of size N
        Leftmax of i contain the maximum for the 
        index 0 to index 1

        Arr [-3,6,2,4,5,2,8,-9,3,1]

        N : 10

 */

 import java.util.*;

class Solution {

    static int[] optimizedApproch(int arr[]) {

        int leftMax[] = new int[arr.length];
        int max = Integer.MIN_VALUE;

        leftMax[0] = arr[0];

        for(int i=1; i<arr.length; i++) {

            if(max < arr[i]) {

                max = arr[i];
            }
            leftMax[i] = max;
        }
        return leftMax;
    }
    static int[] bruteForceApproach(int arr[]) {

        int leftMax[] = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int max = Integer.MIN_VALUE;

            for(int j=0; j<=i; j++) {

                if(max <= arr[j]) {

                    max = arr[j];
                }
                leftMax[i] = max;
            }
        }
        return leftMax;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements : ");
		for(int i=0; i<size; i++) {

			arr[i] = sc.nextInt();
		}

        int[] leftMax1 = bruteForceApproach(arr);
        int[] leftMax2 = optimizedApproch(arr);
        
        //bruteforce
        System.out.print("[");
        for(int i=0; i<leftMax1.length; i++) {

            System.out.print(leftMax1[i]+" ");
        }
        System.out.println("]");

        //optimize
        System.out.print("[");
        for(int i=0; i<leftMax2.length; i++) {

            System.out.print(leftMax2[i]+" ");
        }
        System.out.println("]");
    }
}