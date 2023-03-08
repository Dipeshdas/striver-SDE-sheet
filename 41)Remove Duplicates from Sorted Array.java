//CODE STUDIO

import java.util.ArrayList;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int i=0;
		for(int j=1;j<n;j++){
			if(!arr.get(j).equals(arr.get(i))){
				i++;
				arr.set(i,arr.get(j));
			}
		}
		return i+1;
	}
}

//LEETCODE
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            
        }
        return i+1;
    }
}
