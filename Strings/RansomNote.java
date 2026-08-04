/**
 * Problem: LeetCode 383 - Ransom Note
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Frequency Array
 *
 * Approach:
 * - Count the frequency of characters in the ransom note.
 * - Count the frequency of characters in the magazine.
 * - Compare both frequency arrays.
 * - If any required character appears more times in the ransom note than in the magazine, return false.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            freq1[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            freq2[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                return false;
            }
        }
        return true;
    }
}
