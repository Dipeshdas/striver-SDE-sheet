//LEETCODE

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer>dq=new ArrayDeque<>();
        int ans[]=new int[n-k+1];
        int ani=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }

            dq.offer(i);
            if(i>=k-1){
                ans[ani++]=nums[dq.peek()];
            }
        }
        return ans;
    }
}

//Code Studio
import java.util.* ;
import java.io.*;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		int n=nums.size();
		ArrayList<Integer>ans=new ArrayList<>();

		Deque<Integer>dq=new ArrayDeque<>();
		int ani=0;

		for(int i=0;i<n;i++){
			if(!dq.isEmpty() && dq.peek()==i-k){
				dq.poll();
			}
			while(!dq.isEmpty() && nums.get(dq.peekLast())<nums.get(i)){
				dq.pollLast();
			}

			dq.offer(i);

			if(i>=k-1){
				ans.add(ani++,nums.get(dq.peek()));
			}
		}
		return ans;
	}
}
