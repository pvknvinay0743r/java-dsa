/**
 * Problem: LeetCode 151 - Reverse Words in a String
 * Topic: Strings
 * Difficulty: Medium
 *
 * Pattern: String Manipulation
 *
 * Approach:
 * - Remove leading and trailing spaces.
 * - Split the string into words using one or more spaces.
 * - Traverse the array from the end.
 * - Build the reversed sentence using StringBuilder.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Author: Vinay
 */

class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        String[] words=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=1;i--){
            sb.append(words[i]).append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
