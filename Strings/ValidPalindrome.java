public class Solution {
    public boolean isPalindrome(String s) {
        // Handle edge cases where string is empty
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move right pointer if the character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // Compare characters after converting them to lowercase
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }
        
        return true; // Valid palindrome
    }
}
