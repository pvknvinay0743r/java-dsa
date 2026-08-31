/*
 * LeetCode #33 - Search in Rotated Sorted Array
 * Difficulty: Medium
 *
 * Problem:
 * Search for a target value in a rotated sorted array and return its index.
 * Return -1 if the target is not present.
 *
 * Approach:
 * Use modified binary search to identify the sorted half of the array.
 * Determine whether the target lies within that half and eliminate the other half.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */


class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==1){
        if(target==nums[0]){
            return 0;
        }else{
            return -1;
        }
       }else{
        int left=0,right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target) return mid;

            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
       }

       return -1;
    }
}
