import java.util.* ;
import java.io.*; 
public class Solution {

    public static long merge(long arr[],long temp[],int low,int mid,int high){
        long countInverse=0;
        int i=low;
        int j=mid;
        int k=low;
        while(i<=mid-1 && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                countInverse = countInverse + (mid - i);
            }
        }

        while(i <= mid - 1)
            temp[k++] = arr[i++];

        while(j <= high)
            temp[k++] = arr[j++];

        for(int m = low ; m <= high ; m++)
            arr[m] = temp[m];
        
        return countInverse;
    }

    public static long mergeSort(long arr[],long temp[],int low,int high){
        long countInverse=0;
        if(high>low){
            int mid=(low+high)/2;
            countInverse+=mergeSort(arr,temp, low, mid);
            countInverse+=mergeSort(arr,temp, mid+1, high);

            countInverse+=merge(arr,temp,low,mid+1,high);
        }
        return countInverse;

    }
    public static long getInversions(long arr[], int n) {
        long temp[]=new long[n];
        long ans=mergeSort(arr,temp,0,n-1);
        return ans;
    }
}
