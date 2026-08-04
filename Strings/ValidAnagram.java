/**
 * Problem: LeetCode 242 - Valid Anagram
 * Topic: Strings
 * Difficulty: Easy
 *
 * Pattern: Frequency Array
 *
 * Approach:
 * - Count the frequency of each character in both strings.
 * - Compare both frequency arrays.
 * - If both arrays are equal, the strings are anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        /*char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }else{
            return false;
        }*/
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        return false;
    }
}
