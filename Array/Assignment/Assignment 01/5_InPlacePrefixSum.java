
/*
    Program 5 : In-place Prefix Sum
                Problem Description
                - Given an array A of N integers.
                - Construct the prefix sum of the array in the given array itself.

                Problem Constraints
                1 <= N <= 105
                1 <= A[i] <= 103

                Example Input
                Input 1:
                A = [1, 2, 3, 4, 5]
                Input 2:
                A = [4, 3, 2]

                Example Output
                Output 1:
                [1, 3, 6, 10, 15]
                Output 2:
                [4, 7, 9]

                Example Explanation

                Explanation 1:
                The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
                Explanation 2:
                The prefix sum array of [4, 3, 2] is [4, 7, 9].
*/

import java.util.*;

class Solution {

    static int[] prefixSum(int arr[]) {

        arr[0] = arr[0];

        for(int i=1; i<arr.length; i++) {

            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0; i<arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        int ps[] = prefixSum(arr);

        System.out.println("Updated prefix sum array : ");
        System.out.print("[ ");
        for(int i=0; i<ps.length; i++) {
            
            System.out.print(ps[i]+" ");
        }
        System.out.println("]");
    }
}