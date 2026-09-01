/*
 * LeetCode #153 - Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 *
 * Problem:
 * Find the minimum element in a rotated sorted array containing distinct values.
 *
 * Approach:
 * Use binary search and compare the middle element with the rightmost element.
 * If arr[mid] is greater, the minimum is in the right half; otherwise, keep mid
 * as a possible minimum and search the left half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int findMin(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[right]<arr[mid]){
                left=mid+1;
               
            }else{
                 right=mid;
                
            }
        }
        return arr[left];
    }
}
