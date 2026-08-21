/*
 * LeetCode #4 - Median of Two Sorted Arrays
 * Difficulty: Hard
 *
 * Problem:
 * Find the median of two sorted arrays after combining their elements.
 *
 * Approach:
 * Copy both arrays into a single array, sort it, and calculate the median
 * based on whether the total number of elements is odd or even.
 *
 * Time Complexity: O((m + n) log(m + n))
 * Space Complexity: O(m + n)
 *
 * Author: Vinay
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int []res=new int[m+n];
        int i=0,j=0,k=0;
        while(i<nums1.length){
            res[k++]=nums1[i++];
        }
        
        while(j<nums2.length){
            res[k++]=nums2[j++];
        }
        Arrays.sort(res);
        double sum=0.00d;
        if((m+n)%2!=0){
            int index=res.length/2;
            sum=(double)res[index];      
        }else{
            int index=res.length/2-1;
            int index2=res.length/2;
            sum=(double)((res[index]+res[index2])/2.0);
            
        }
        return sum;
    }
}
