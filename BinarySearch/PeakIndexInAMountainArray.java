/*
 * LeetCode #852 - Peak Index in a Mountain Array
 * Difficulty: Medium
 *
 * Problem:
 * Find the index of the peak element in a mountain array.
 * The array strictly increases up to the peak and then strictly decreases.
 *
 * Approach:
 * Use binary search to determine which side of the peak the middle element
 * lies on. Move right while the array is increasing; otherwise move left.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

       //USING LINEAR SEARCH

        // for(int i =1;i<arr.length-1;i++){

        //     if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){

        //         return i;

        //     }

        // }

        // return -1;

        //USING BINARY SEARCH

        int left=1,right=arr.length-2;

        // if left=0 and right=arr.length-1, checking
        // arr[mid-1] or arr[mid+1] could go out of bounds.
      //example arr=[0.3,2,1,0]

        while(left<=right){

            int mid=left+(right-left)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

                return mid;

            }else if(arr[mid]>=arr[mid-1]){

                left=mid+1;

            }else{

                right=mid-1;

            }
        }

        return -1;
    }
}
