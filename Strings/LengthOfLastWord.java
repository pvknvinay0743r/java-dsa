/**
 * Problem: LeetCode 58 - Length of Last Word
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Reverse Traversal
 *
 * Approach:
 * - Remove trailing spaces using stripTrailing().
 * - Traverse the string from the end.
 * - Count characters until a space is encountered.
 * - Return the count as the length of the last word.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */

class Solution {
    public int lengthOfLastWord(String s) {
        /*s=s.trim();
        String words[]=s.split("\\s+");
        
        return words[words.length-1].length();
        */
       s = s.stripTrailing();
int i = s.length() - 1,count=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                count++;
            }
            if(s.charAt(i)==' '){
                return count;
            }
            i--;
        }
            return count;
    }
}
