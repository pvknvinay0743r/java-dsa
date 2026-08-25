/*
 * LeetCode #1768 - Merge Strings Alternately
 * Difficulty: Easy
 *
 * Problem:
 * Merge two strings by taking characters alternately from each string.
 * Append the remaining characters when one string is exhausted.
 *
 * Approach:
 * Use two pointers to traverse both strings simultaneously, append one
 * character from each, then append any remaining characters.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m) — StringBuilder stores the resulting string.
 *
 * Author: Vinay
 */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            sb.append(word1.charAt(i));
             i++;
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j));
             j++;
        }
        return sb.toString();
    }
}
