/*
 * LeetCode #35 - Search Insert Position
 * Difficulty: Easy
 *
 * Problem:
 * Find the index where the target is located in a sorted array,
 * or the position where it should be inserted to maintain sorted order.
 *
 * Approach:
 * Use binary search to find the first index whose value is greater
 * than or equal to the target, storing that index as the lower bound.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int searchInsert(int[] nums, int target) {

       int lb = nums.length;

       int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {

                lb = Math.min(lb, mid);
                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        return lb;
    }
}
