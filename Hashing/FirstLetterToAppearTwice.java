/*
 * LeetCode #2351 - First Letter to Appear Twice
 * Difficulty: Easy
 *
 * Problem:
 * Find the first lowercase English letter that appears twice in the string.
 *
 * Approach:
 * Use a frequency array of size 26 to count each character. Return the
 * character immediately when its frequency reaches 2.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public char repeatedCharacter(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']==2){
                return (ch);
            }
        }
        return ' ';
    }
}
