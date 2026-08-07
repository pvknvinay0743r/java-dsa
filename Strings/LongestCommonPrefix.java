/**
 * Problem: LeetCode 14 - Longest Common Prefix
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Character-by-Character Comparison
 *
 * Approach:
 * - Use the first string as the reference.
 * - Compare each character with the corresponding character in all other strings.
 * - Stop when a mismatch or string boundary is encountered.
 * - Return the common prefix found so far.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1)
            return strs[0];

        String first = strs[0];

        int index = 0;

        while (index < first.length()) {

            char ch = first.charAt(index);

            int l = 1;

            while (l < strs.length) {

                if (index >= strs[l].length())
                    return first.substring(0, index);

                if (strs[l].charAt(index) != ch)
                    return first.substring(0, index);

                l++;
            }

            index++;
        }

        return first;
    }
}
