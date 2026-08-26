/*
 * LeetCode #704 - Binary Search
 * Difficulty: Easy
 *
 * Problem:
 * Find the target value in a sorted array and return its index.
 * Return -1 if the target is not present.
 *
 * Approach:
 * Use two pointers to define the search range and repeatedly calculate
 * the middle index, eliminating half of the search space after each comparison.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public int search(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<target) left=mid+1;
            else if(arr[mid]>target) right=mid-1;
            else{
                index=mid;
                break;
            }
        }
        return index;
    }
}
