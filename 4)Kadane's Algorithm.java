//LEETCODE

class Solution {
    public int maxSubArray(int[] nums) {
        int maximum=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            if(cur>maximum){
                maximum=cur;
            }
            if(cur<0){
                cur=0;
            }
            
        }
        return maximum;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum=0;
		long maxSum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum>maxSum) maxSum=sum;
			if(sum<0) sum=0;
		}
		return maxSum;
	}

}
