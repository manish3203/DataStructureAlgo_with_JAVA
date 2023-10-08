
/*
    Program 3 : Search Insert Position (LeetCode-35)

                Given a sorted array of distinct integers and a target value, return the index
                if the target is found. If not, return the index where it would be if it were
                inserted in order.
                You must write an algorithm with O(log n) runtime complexity.

                Example 1:
                Input: nums = [1,3,5,6], target = 5
                Output: 2

                Example 2:
                Input: nums = [1,3,5,6], target = 2
                Output: 1

                Example 3:
                Input: nums = [1,3,5,6], target = 7
                Output: 4

                Constraints:
                1 <= nums.length <= 104
                -104 <= nums[i] <= 104
                nums contains distinct values sorted in ascending order.
                -104 <= target <= 104
 */

 import java.util.*;

 class Solution {

    static int searchInsert(int[] nums, int target) {
        
        int var = 0;

        if(0 < nums[0]) {

            var = 0;
        }
        if(nums[nums.length-1]<target) {

            var = nums.length;
        }
        for(int i=1; i<nums.length; i++) {

            if(target == nums[i]) {

                var = i;
            }
            if(target < nums[i] && target > nums[i-1]) {

                var = i;
            }
        }
        return var;
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

        System.out.println("Enter target elements : ");
        int target = sc.nextInt();

        int index = searchInsert(arr, target);

        System.out.println("Index : "+index);
    }
 }