/*
 * LeetCode #169 - Majority Element
 * Difficulty: Easy
 *
 * Problem:
 * Find the element that appears more than n/2 times in the given array.
 *
 * Approach:
 * Sort the array and return the element at index n/2, which must be
 * the majority element because it occurs more than half of the array.
 *
 * Time Complexity: O(n log n) — Arrays.sort() dominates the runtime.
 * Space Complexity: O(log n) — Extra space used by the sorting implementation.
 *
 * Author: Vinay
 */
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
       /* for (int i = 0; i < n; i++) {
            int count = 1; // count nums[i] itself

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // won't occur because majority element is guaranteed*/
    }
}
