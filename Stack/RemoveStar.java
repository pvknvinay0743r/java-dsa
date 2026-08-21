/**  
 * Problem: LeetCode 2390 - Removing Stars From a String 
 * Topic: Stack 
 * Difficulty: Medium 
 *  
 * Pattern: Stack / String Processing 
 *  
 * Approach:  
 * - Traverse the string from left to right.
 * - Use Stack to store non-star characters.
 * - If the current character is not '*', push it into the stack.
 * - If '*' is encountered, pop the top character from the stack.
 * - Traverse the stack and build the final string using StringBuilder.
 *  
 * Time Complexity: O(n) 
 * Space Complexity: O(n) 
 *  
 * Author: Vinay 
 */

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != '*'){
                st.push(ch);
            }else{
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : st){
            sb.append(ch);
        }

        return sb.toString();
    }
}
