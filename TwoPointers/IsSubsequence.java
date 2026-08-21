/*
 * LeetCode #392 - Is Subsequence
 * Difficulty: Easy
 *
 * Problem:
 * Determine whether string s is a subsequence of string t.
 * The characters of s must appear in t in the same order.
 *
 * Approach:
 * Use two pointers to scan both strings. When characters match, move
 * both pointers; otherwise, move only the pointer for string t.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()>t.length()){
            return false;
        }
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                
            }else{
               
                j++;
            }
        }
        return i==s.length();
    }
}
