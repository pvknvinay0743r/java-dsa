/**
 * Problem: LeetCode 2423 - Remove Letter To Equalize Frequency
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Frequency Array + Simulation
 *
 * Approach:
 * - Count the frequency of each character.
 * - Try removing one occurrence of every existing character.
 * - After each removal, check whether all remaining non-zero frequencies are equal.
 * - Restore the removed frequency before checking the next possibility.
 *
 * Time Complexity: O(26 × 26) ≈ O(1)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */

class Solution {
    public boolean equalFrequency(String word) {

        int[] freq = new int[26];

        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0)
                continue;

            freq[i]--;

            int target = 0;
            boolean equal = true;
            for(int j = 0; j < 26; j++){
                if(freq[j] == 0)
                    continue;
                if(target == 0){
                    target = freq[j];
                }
                else if(freq[j] != target){
                    equal = false;
                    break;
                }
            }
            freq[i]++;
            if(equal){
                return true;
            }
        }

        return false;
    }
}
