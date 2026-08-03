/**
 * Problem: LeetCode 387 - First Unique Character in a String
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Frequency Array
 *
 * Approach:
 * - Count the frequency of every character.
 * - Traverse the string again.
 * - Return the index of the first character whose frequency is 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */

class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequencies
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

}
