/*
 * LeetCode #520 - Detect Capital
 * Difficulty: Easy
 *
 * Problem:
 * Determine whether the capitalization in a word is used correctly.
 * Valid forms are all uppercase, all lowercase, or only the first letter uppercase.
 *
 * Approach:
 * Count the uppercase and lowercase characters. Return true when all characters
 * have the same case, or when only the first character is uppercase.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0,lower=0;
        int len=word.length();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }else{
                lower++;
            }
        }
        if(len==upper || len==lower){
            return true;
        }
        else if(Character.isUpperCase(word.charAt(0)) && (lower==len-1)){
            return true;
        }else{
            return false;
        }
    }
}
