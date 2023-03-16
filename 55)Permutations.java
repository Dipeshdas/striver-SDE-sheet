
//LEETCODE
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,ans);
        return ans;
    }
    public void solve(int ind,int[] nums,List<List<Integer>>ans){
        if(ind==nums.length){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            solve(ind+1,nums,ans);
            swap(i,ind,nums);//backtrack
        }
    }

    public void swap(int i,int j,int[]nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
        char nums[]=s.toCharArray();
        List<String>ans=new ArrayList<>();
        solve(0,nums,ans);
        return ans;
    }

    public static void solve(int ind,char[] nums,List<String>ans){
        if(ind==nums.length){
            String str="";
            for(int i=0;i<nums.length;i++){
                str+=nums[i];
            }
            ans.add(str);
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            solve(ind+1,nums,ans);
            swap(i,ind,nums);//backtrack
        }
    }

    public static void swap(int i,int j,char[]nums){
        char temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
