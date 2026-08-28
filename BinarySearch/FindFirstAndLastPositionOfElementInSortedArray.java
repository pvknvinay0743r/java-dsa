/*
 * LeetCode #34 - Find First and Last Position of Element in Sorted Array
 * Difficulty: Medium
 *
 * Problem:
 * Find the starting and ending positions of a target value in a sorted array.
 * Return [-1, -1] if the target is not present.
 *
 * Approach:
 * Perform two binary searches. The first searches for the leftmost occurrence
 * by continuing left after finding the target, while the second searches for
 * the rightmost occurrence by continuing right after finding the target.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
