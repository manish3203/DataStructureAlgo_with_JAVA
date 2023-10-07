
/*
    Program 1 : Max Min of an Array

                Problem Description
                - Given an array A of size N.
                - You need to find the sum of the Maximum and Minimum

                elements in the given array.

                Problem Constraints
                1 <= N <= 105
                -109 <= A[i] <= 109

                Example Input
                Input 1:
                A = [-2, 1, -4, 5, 3]
                Input 2:
                A = [1, 3, 4, 1]

                Example Output
                Output 1:
                1
                Output 2:
                5

                Example Explanation
                Explanation 1:
                Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
                Explanation 2:
                Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */

 import java.util.*;

 class Solution {

    static int findMinNum(int arr[]) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {

            if(min > arr[i]) {

                min = arr[i];
            }
        }
        return min;
    }
    static int findMaxNum(int arr[]) {

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {

            if(max < arr[i]) {

                max = arr[i];
            }
        }
        return max;
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
        int max = findMaxNum(arr);
        int min = findMinNum(arr);

        int sum = max+min;

        System.out.println("Maximum Element is "+max+" and Minimum element is "+ min+". ("+max+"+"+min+") = "+sum);
    }
 }