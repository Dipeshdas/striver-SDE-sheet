
//LEETCODE

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp1;
                    high--;
                    break;
            }
        }
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp1;
                    high--;
                    break;
            }

        }
    }
}
