
//LEETCODE SOLUTION
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        } 
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            } 
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse (int []nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }

}

//CODE STUDIO SOLUTION

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		if(permutation==null || permutation.size()<=1) return permutation;

		int i=permutation.size()-2;
		while(i>=0 && permutation.get(i)>=permutation.get(i+1)) i--;
		if(i>=0){
			int j=permutation.size()-1;
			while(permutation.get(j)<=permutation.get(i)) j--;
			Collections.swap(permutation,i,j);
		}
		reverse(permutation,i+1,permutation.size()-1);
		return permutation;
	}
	public static void reverse (ArrayList<Integer> permutation,int i,int j){
        while(i<j){
            Collections.swap(permutation,i++,j--);
        }
    }
}

