
/*
    Program 6 : Product array puzzle
                Problem Description
                - Given an array of integers A, find and return the product array of the same
                size where the ith element of the product array will be equal to the

                product of all the elements divided by the ith element of the array.

                - Note: It is always possible to form the product array with integer (32 bit)
                values. Solve it without using the division operator.

                Constraints
                2 <= length of the array <= 1000
                1 <= A[i] <= 10

                For Example
                Input 1:
                A = [1, 2, 3, 4, 5]
                Output 1:
                [120, 60, 40, 30, 24]

                Input 2:
                A = [5, 1, 10, 1]
                Output 2:
                [10, 50, 5, 50]
 */

import java.util.*;

 class Solution {

    static int[] productArrayPuzzle(int arr[]) {

        int mul = 1;
        for(int i=0; i<arr.length; i++) {

            mul = mul*arr[i];
        }
        int newArr[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {

            int count = 0;
            int mul1 = mul;

            while(mul1 >= arr[i]) {

                mul1-=arr[i];
                count+=1;
            }
            newArr[i] = count; 
        }
        return newArr;
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

        int puzzleArray[] = productArrayPuzzle(arr);

        System.out.println("Product array puzzle : ");
        System.out.print("[ ");
        for(int i=0; i<puzzleArray.length; i++) {
            
            System.out.print(puzzleArray[i]+" ");
        }
        System.out.println("]");


    }
 }
