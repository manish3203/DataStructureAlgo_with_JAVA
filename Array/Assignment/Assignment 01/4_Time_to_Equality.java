
/*
    Program 4 : Time to equality
                Problem Description
                - Given an integer array A of size N.
                - In one second, you can increase the value of one element by 1.
                - Find the minimum time in seconds to make all elements of the array equal.

                Problem Constraints
                1 <= N <= 1000000
                1 <= A[i] <= 1000

                Example Input
                A = [2, 4, 1, 3, 2]
                Example Output
                8

                Example Explanation
                We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */

import java.util.*;

class Solution {    

    static int[] equalityTime(int arr[]) {

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) {

                max = arr[i];
            }
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++) {

            sum = sum+(max-arr[i]);
        }
        for(int i=0; i<arr.length; i++) {

            arr[i] = sum;
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

        int update_arr[] = equalityTime(arr);

        System.out.println("Updated array : ");
        System.out.print("[ ");
        for(int i=0; i<update_arr.length; i++) {
            
            System.out.print(update_arr[i]+" ");
        }
        System.out.println("]");
    }
}