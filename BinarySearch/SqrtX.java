/*
 * LeetCode #69 - Sqrt(x)
 * Difficulty: Easy
 *
 * Problem:
 * Return the integer square root of x, truncating the decimal part.
 *
 * Approach:
 * Use binary search over the range from 0 to x. Compare mid * mid with x
 * and adjust the search range until the largest valid integer square root is found.
 *
 * Time Complexity: O(log x)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int mySqrt(int x) {
        //Approach 1-->
        // int num=0;
        // for(long i=1;i*i<=x;i++){
        //     num=(int)i;
        // }
        // return num;

        //Approach 2-->
        // return (int)Math.sqrt(x);

        //Approach 3-->
        int left=0,right=x;

        while(left<=right){
            long mid=left+(right-left)/2;

            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=(int)mid+1;
            }else{
                right=(int)mid-1;
            }
        }

        return (int)right;
    }
}
