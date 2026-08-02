/**
 * Problem: LeetCode 125 - Valid Palindrome
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: String Processing
 *
 * Approach:
 * - Traverse the string and keep only alphanumeric characters.
 * - Convert each character to lowercase.
 * - Create a reversed version of the processed string.
 * - Compare both strings to determine whether it is a palindrome.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 *
 * Author: Vinay
 */


class Solution {
    public boolean isPalindrome(String s) {
        String clean = "";

        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));

            if(Character.isLetterOrDigit(ch)){
                clean += ch;
            }
        }

        String rev = "";

        for(int i=clean.length()-1;i>=0;i--){
            rev += clean.charAt(i);
        }

        return clean.equals(rev);
    }
}
