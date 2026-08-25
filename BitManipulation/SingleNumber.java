/*
 * LeetCode #136 - Single Number
 * Difficulty: Easy
 *
 * Problem:
 * Find the element that appears only once in an array where every other
 * element appears twice.
 *
 * Approach:
 * XOR all elements together. Equal numbers cancel each other because
 * x ^ x = 0, leaving the single number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=nums[i]^res;
        }
        return res;
    }
}
