//LEETCODE
class Solution {
    public int trap(int[] height) {

        //1st Solution
        // int n=height.length;
        // int left[]=new int[n];
        // int right[]=new int[n];
        // left[0]=height[0];
        // for(int i=1;i<n;i++){
        //     left[i]=Math.max(left[i-1],height[i]);
        // }
        // right[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     right[i]=Math.max(right[i+1],height[i]);
        // }
        // int ans=0;
        // for (int i=0;i<height.length;i++){
        //     ans+=Math.min(left[i],right[i])-height[i];
        // }
        // return ans;

        //Two pointer (Most Optimal)
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftMax=0;
        int rightMax=0;
        int res=0;

        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftMax) leftMax=height[left];
                else res+=leftMax-height[left];
                left++;
            }
            else{
                if(height[right]>=rightMax) rightMax=height[right];
                else res+=rightMax-height[right];
                right--;
            }
        }
        return res;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        //long n=arr.length;
        long ans=0;
        int left=0,right=n-1;
        long leftMax=0,rightMax=0;

        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftMax) leftMax=arr[left];
                else ans+=leftMax-arr[left];
                left++;
            }
            else{
                if(arr[right]>=rightMax) rightMax=arr[right];
                else ans+=rightMax-arr[right];
                right--;
            }
        }
        return ans;
    }
}
