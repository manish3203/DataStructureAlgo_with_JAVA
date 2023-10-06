
/*
    13] Given an integer array of size N.
        Build an array righttmax of size N
        Rightmax of i contain the maximum for the 
        index 0 to index 1

        Arr [-3,6,2,4,5,2,8,-9,3,1]

        N : 10

 */

 import java.util.*;

class Solution {

    static int[] optimizedApproch(int arr[]) {

        int rightMax[] = new int[arr.length];
        int max = Integer.MIN_VALUE;

        rightMax[0] = arr[0];

        for(int i=arr.length-1; i>=1; i--) {

            if(max < arr[i]) {

                max = arr[i];
            }
            rightMax[i] = max;
        }
        return rightMax;
    }
    static int[] bruteForceApproach(int arr[]) {

        int rightMax[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            int max = Integer.MIN_VALUE;

            for(int j=arr.length-1; j>=i; j--) {

                if(max <= arr[j]) {

                    max = arr[j];
                }
                rightMax[i] = max;
            }
        }
        return rightMax;
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

        int[] rightMax1 = bruteForceApproach(arr);
        int[] rightMax2 = optimizedApproch(arr);
        
        //bruteforce
        System.out.print("[");
        for(int i=0; i<rightMax1.length; i++) {

            System.out.print(rightMax1[i]+" ");
        }
        System.out.println("]");

        //optimize
        System.out.print("[");
        for(int i=0; i<rightMax2.length; i++) {

            System.out.print(rightMax2[i]+" ");
        }
        System.out.println("]");

    }
}