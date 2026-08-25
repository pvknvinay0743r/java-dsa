/*
 * LeetCode #75 - Sort Colors
 * Difficulty: Medium
 *
 * Problem:
 * Sort an array containing 0s, 1s, and 2s in-place so that elements
 * of the same color are adjacent and ordered as 0, 1, 2.
 *
 * Approach:
 * Use insertion sort to place each element in its correct position
 * by shifting larger preceding elements to the right.
 *
 * Time Complexity: O(n²) — Uses nested loops in the worst case.
 * Space Complexity: O(1) — Only constant extra variables are used.
 *
 * Author: Vinay
 */
class Solution {
    public void sortColors(int[] arr) {
       for(int i=1;i<arr.length;i++){
        for(int j=i;j>=1;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }else{
                break;
            }
        }
       } 
    }
}
