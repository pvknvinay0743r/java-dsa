/*
 * LeetCode #434 - Number of Segments in a String
 * Difficulty: Easy
 *
 * Problem:
 * Count the number of segments in a string, where a segment is a
 * sequence of non-space characters separated by spaces.
 *
 * Approach:
 * Remove leading and trailing whitespace using strip(), split the string
 * using one or more whitespace characters, and return the number of words.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Author: Vinay
 */
class Solution {
    public int countSegments(String s) {
        
        s=s.strip();
        if(s.length()==0){
            return 0;
        }
        String arr[]=s.split("\\s+");
        return arr.length;
    }
}
/*
class Solution {
    public int countSegments(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != ' ' &&
               (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }
}*/
