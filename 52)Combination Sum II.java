//LEETCODE
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    public void solve(int ind,int target,int[]candidates,List<List<Integer>>ans,ArrayList<Integer>temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=ind;i<candidates.length;i++){
            if(i!=ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            temp.add(candidates[i]);
            solve(i+1,target-candidates[i],candidates,ans,temp);
            temp.remove(temp.size()-1);
        }
    }    
}

//CODE STUDIO
import java.util.ArrayList;
import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(0,target,arr,ans,new ArrayList<>());
        return ans;
    }
    public static void solve(int ind,int target,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=ind;i<arr.size();i++){
            if(i!=ind && arr.get(i)==arr.get(i-1)) continue;
            if(arr.get(i)>target) break;

            temp.add(arr.get(i));
            solve(i+1,target-arr.get(i),arr,ans,temp);
            temp.remove(temp.size()-1);
        }
    }    
}
