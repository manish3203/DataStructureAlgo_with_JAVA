
/*
    Program 2 : Linear Search - Multiple Occurences
                Problem Description
                Given an array A and an integer B, find the number of occurrences of B in A.

                Problem Constraints
                1 <= B, Ai <= 109
                1 <= length(A) <= 105

                Example Input
                Input 1:
                A = [1, 2, 2], B = 2
                Input 2:
                A = [1, 2, 1], B = 3

                Example Output
                Output 1:
                2
                Output 2:
                0

                Example Explanation
                Explanation 1:
                Element at index 2, 3 is equal to 2 hence count is 2.
                Explanation 2:
                There is no element equal to 3 in the array.
 */


 import java.util.*;

 class Solution {

    static int occuranceNum(int arr[], int B) {

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == B) {

                count++;
            }
        }
        return count;
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
        System.out.println("Enter integer to find the occurance :");
        int B = sc.nextInt();

        int countNum = occuranceNum(arr,B);

        if(countNum == 0) {

            System.out.println("There is no elements equal to "+B+" in the array.");
        }else {
            
            System.out.println("Count : "+countNum);
        }
    }
 }