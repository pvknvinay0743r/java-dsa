/*
 * LeetCode #551 - Student Attendance Record I
 * Difficulty: Easy
 *
 * Problem:
 * Determine whether a student's attendance record is eligible for an award.
 * The record is invalid if it contains 2 or more absences or 3 consecutive late days.
 *
 * Approach:
 * Traverse the attendance record while counting absences and consecutive late days.
 * Reset the late count when an absence or presence is found and check both conditions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public boolean checkRecord(String s) {
     int late=0,abs=0;
     boolean isFound=true;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A'){
            abs++;
            late=0;
        }else if(s.charAt(i)=='L'){
            late++;
            if(late>2){isFound=false;}
        }else{
            late=0;
        }
     }
     if(isFound && abs<2){
        return true;
     }
     return false;
     

    }
}
