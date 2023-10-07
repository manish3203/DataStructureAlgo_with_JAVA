
/*
    Program 3 : Range Sum Query

                Problem Description
                - You are given an integer array A of length N.
                - You are also given a 2D integer array B with dimensions M x 2, where each row

                denotes a [L, R] query.
                - For each query, you have to find the sum of all elements from L to R indices

                in A (0 - indexed).
                - More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

                Problem Constraints
                1 <= N, M <= 103
                1 <= A[i] <= 105
                0 <= L <= R < N

                Example Input
                Input 1:
                A = [1, 2, 3, 4, 5]
                B = [[0, 3], [1, 2]]

                Input 2:
                A = [2, 2, 2]
                B = [[0, 0], [1, 2]]

                Example Output
                Output 1:
                [10, 5]

                Output 2:
                [2, 4]

                Example Explanation
                Explanation 1:
                The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
                The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
                Explanation 2:
                The sum of all elements of A[0 ... 0] = 2 = 2.
                The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 */

import java.util.*;

class Solution {

    static void rangeQuerySum(int arr[], int Q) {

        Scanner sc = new Scanner(System.in);

        int startIndex = 0;
        int endIndex = 0;
        for(int i=0; i<Q; i++) {
            int sum = 0;
            System.out.println("Enter Queries" +(i+1));
            startIndex = sc.nextInt();
            endIndex = sc.nextInt();

            if(startIndex > arr.length || startIndex < arr.length || endIndex > arr.length || endIndex < arr.length) {

                System.out.println("Please enter valid index : ");
                return;
            }

            for(int j=startIndex; j<=endIndex; j++) {

                sum = arr[j] + sum;
            }
            System.out.println("["+startIndex+" "+endIndex+"] = "+sum);
        }
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
        System.out.println("Enter the number of queries : ");
        int Q = sc.nextInt();

        rangeQuerySum(arr, Q);
    }
}