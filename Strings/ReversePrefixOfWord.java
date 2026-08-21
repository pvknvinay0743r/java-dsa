/*
 * LeetCode #2000 - Reverse Prefix of Word
 * Difficulty: Easy
 *
 * Problem:
 * Reverse the part of the word from the beginning up to and including
 * the first occurrence of the given character.
 *
 * Approach:
 * Find the first occurrence of ch, traverse that prefix backward into
 * a StringBuilder, then append the remaining characters in their order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Author: Vinay
 */
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        if(word.indexOf(ch)==-1){
            return word;
        }else{
            int num=word.indexOf(ch);
            for(int i=num;i>=0;i--){
                sb.append(word.charAt(i));
            }
            for(int i=num+1;i<word.length();i++){
                sb.append(word.charAt(i));
            }
        }
     return sb.toString();
    }
}
