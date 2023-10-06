
/*
    Program 1 : Reverse Integer (Leetcode:- 7)

                Given a signed 32-bit integer x, return x with its digits reversed. If reversing
                x causes the value to go outside the signed 32-bit integer range [-231, 231 -1], then return 0.
                Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

                Example 1:
                Input: x = 123
                Output: 321

                Example 2:
                Input: x = -123
                Output: -321

                Example 3:
                Input: x = 120
                Output: 21

                Constraints:
                -231 <= x <= 231 - 1
 */

 import java.util.*;

 class Solution {

    static int reverseInt(int x) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        long rev = 0;
        while(x != 0) {

            int rem = x%10;
            rev = rev*10+rem;
            x=x/10;
        }
        if(rev <= min || rev > max) {

            return 0;
        }else{
            
            return (int)rev;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        
        int reverseNum = reverseInt(num);

        System.out.println(reverseNum);
        
    }
 }