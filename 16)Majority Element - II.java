
//LEETCODE

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer>a=new ArrayList<>();
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
        //     if(entry.getValue()>nums.length/3){
        //         a.add(entry.getKey());
        //     }
        // }
        // return a;

        //Boyer Moore’s Voting Algorithm
        int nums1=-1;
        int nums2=-2;
        int n=nums.length;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<n;i++){

            if(nums[i]==nums1) ct1++;
            else if(nums[i]==nums2) ct2++;

            else if(ct1==0){
                nums1=nums[i];
                ct1=1;
            }
            else if(ct2==0){
                nums2=nums[i];
                ct2=1;
            }
            else{
                ct1--;
                ct2--;
            }
        }

        List<Integer>ans=new ArrayList<>();
        ct1=0;
        ct2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums1){
                ct1++;
            }
            if(nums[i]==nums2){
                ct2++;
            }
        }
        if(ct1>n/3) ans.add(nums1);
        if(ct2>n/3) ans.add(nums2);
        return ans;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        int nums1=-1;
        int nums2=-1;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<arr.size();i++){

            if(arr.get(i)==nums1) ct1++;
            else if(arr.get(i)==nums2) ct2++;

            else if(ct1==0){
                nums1=arr.get(i);
                ct1=1;
            }
            else if(ct2==0){
                nums2=arr.get(i);
                ct2=1;
            }
            else{
                ct1--;
                ct2--;
            }
        }

        ArrayList<Integer>ans=new ArrayList<>();
        ct1=0;
        ct2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==nums1){
                ct1++;
            }
            if(arr.get(i)==nums2){
                ct2++;
            }
        }
        if(ct1>arr.size()/3) ans.add(nums1);
        if(ct2>arr.size()/3) ans.add(nums2);
        return ans;
    }
}
