//LEETCODE
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid] == target)
                return mid; 

            if (nums[low] <= nums[mid]) { 
                if (nums[low] <= target && nums[mid] >= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}

//CODE STUDIO
public class Solution {
    public static int search(int arr[], int key) {
        int low = 0, high = arr.length - 1; 

        while (low <= high) { 
            int mid = (low + high) >> 1; 
            if (arr[mid] == key)
                return mid; 

            if (arr[low] <= arr[mid]) { 
                if (arr[low] <= key && arr[mid] >= key)
                    high = mid - 1; 
                else
                    low = mid + 1; 
            } else { 
                if (arr[mid] <= key && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
