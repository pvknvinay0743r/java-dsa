/*
 * LeetCode #283 - Move Zeroes
 * Difficulty: Easy
 *
 * Problem:
 * Move all zeroes to the end of the array while maintaining the
 * relative order of the non-zero elements.
 *
 * Approach:
 * Use an index pointer to place non-zero elements at the front,
 * then fill the remaining positions with zeroes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Vinay
 */
class Solution {
    public void moveZeroes(int[] arr) {
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }
}
