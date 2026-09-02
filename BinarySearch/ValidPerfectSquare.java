/*
 * LeetCode #367 - Valid Perfect Square
 * Difficulty: Easy
 *
 * Problem:
 * Determine whether a given positive integer is a perfect square
 * without using built-in square-root functions.
 *
 * Approach:
 * Use binary search to find an integer whose square equals the given
 * number. Compare the middle value's square with the target to adjust
 * the search range.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }

        return false;
    }
}
