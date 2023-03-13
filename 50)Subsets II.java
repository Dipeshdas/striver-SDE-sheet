//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(0,arr,n,ans,new ArrayList<>());
        return ans;
    }

    public static void solve(int ind,int arr[],int n,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<n;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            solve(i+1,arr,n,ans,temp);
            temp.remove(temp.size()-1);
        }
    }

}

//LEETCODE

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int ind,int[]nums,ArrayList<Integer>temp,List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;//for duplicate checking
            temp.add(nums[i]);
            solve(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
