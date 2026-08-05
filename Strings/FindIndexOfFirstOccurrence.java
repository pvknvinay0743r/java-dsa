/**
 * Problem: LeetCode 28 - Find the Index of the First Occurrence in a String
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Built-in String Methods
 *
 * Approach:
 * - Check if the needle exists in the haystack using contains().
 * - If it exists, return its starting index using indexOf().
 * - Otherwise, return -1.
 *
 * Time Complexity: O(n * m) (depends on the underlying implementation)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}

// Note: Solved using Java built-in String methods.
// Will revisit this problem later with a manual implementation.
