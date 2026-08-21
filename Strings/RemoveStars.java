/** 
 * Problem: LeetCode 2390 - Removing Stars From a String
 * Topic: Strings
 * Difficulty: Medium
 * 
 * Pattern: Stack / String Processing
 * 
 * Approach: 
 * - Traverse the string from left to right.
 * - Use StringBuilder to store characters.
 * - If '*' is found, delete the last character.
 * - Otherwise, append the current character.
 * - Return the final StringBuilder result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Author: Vinay
 */
class Solution {
    public String removeStars(String s) {
       
        StringBuilder sb = new StringBuilder();

        if(s.length() == 1){
            return s;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                // sb has built-in function to find the length using "length()"
                sb.deleteCharAt(sb.length() - 1); // deletes the last character
            }else{
                sb.append(ch); // if not star then append it to sb
            }
        }

        return sb.toString();
    }
}
