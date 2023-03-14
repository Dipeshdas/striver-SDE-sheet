class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void solve(int ind,int[]candidates,int target,List<List<Integer>>ans,ArrayList<Integer>temp){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[ind]<=target){
            temp.add(candidates[ind]);
            solve(ind,candidates,target-candidates[ind],ans,temp);//for pick
            temp.remove(temp.size()-1);//in the time of backtrack just removing the last element from the arraylist.
        }
        solve(ind+1,candidates,target,ans,temp);//for not pick

    }
}

//CODE STUDIO

import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(0,arr,k,ans,new ArrayList<>());
        return ans;
    }

    public static void solve(int ind,ArrayList<Integer> arr,int target,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp){
        if(ind==arr.size()){
            if(target==0 && temp.size()!=0){
                ans.add(temp);
            }
            return;
        }
        solve(ind+1,arr,target,ans,temp);//for not pick

        ArrayList<Integer> temp2 = new ArrayList<>(temp);
        temp2.add(arr.get(ind));

        solve(ind+1,arr,target-arr.get(ind),ans,temp2);//for pick
        
        

    }
}
