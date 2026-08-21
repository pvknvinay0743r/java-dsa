/*
 * LeetCode #557 - Reverse Words in a String III
 * Difficulty: Easy
 *
 * Problem:
 * Reverse the characters of each word in a string while keeping
 * the order of the words unchanged.
 *
 * Approach:
 * Split the string into words and traverse each word from right to
 * left, appending its characters to a StringBuilder.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Author: Vinay
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                char ch=words[i].charAt(j);
                sb.append(ch);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
