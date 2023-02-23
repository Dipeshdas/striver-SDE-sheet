//LEETCODE 

class Solution {
    public int majorityElement(int[] nums) {
        // int k=0;
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }
        // for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        //     if(entry.getValue()>nums.length/2){
        //         k=entry.getKey();
        //     }
        // }
        // return k;
        
        //--------------
        //Boyer Moore’s Voting Algorithm
        int count=0;
		int ans=0;
		for(int i=0;i<nums.length;i++){
			if(count==0){
				ans=nums[i];
			}
			if(nums[i]==ans) count+=1;
			else count-=1;
		}
		return ans;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count=0;
		int ans=0;
		for(int i=0;i<n;i++){
			if(count==0){
				ans=arr[i];
			}
			if(arr[i]==ans) count+=1;
			else count-=1;
		}
		count=0;
		for(int i=0;i<n;i++){
			if(arr[i]==ans){
				count++;
			}
		}
		if(count>n/2) return ans;
		return -1;
	}
}
