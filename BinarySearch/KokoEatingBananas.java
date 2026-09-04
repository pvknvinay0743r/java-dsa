/*
 * LeetCode #875 - Koko Eating Bananas
 * Difficulty: Medium
 *
 * Problem:
 * Find the minimum eating speed k such that Koko can eat all banana
 * piles within h hours.
 *
 * Approach:
 * Use binary search on the possible eating speed from 1 to the
 * maximum pile size. For each speed, calculate the total hours
 * required using ceiling division. If the required hours are within
 * h, search for a smaller speed; otherwise, increase the speed.
 *
 * Time Complexity: O(n log m)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;
            }

            if (totalHours <= h) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
