
//LEETCODE

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=0;
        while(m<nums1.length){
            nums1[m++]=nums2[c++];
        }
        Arrays.sort(nums1);
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int c=0;
        while(m<arr1.length){
            arr1[m++]=arr2[c++];
        }
        Arrays.sort(arr1);
        return arr1;
    }
}
