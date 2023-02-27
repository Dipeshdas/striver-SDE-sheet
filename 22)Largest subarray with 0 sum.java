//GFG

//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(map.get(sum) != null){
                    maxi=Math.max(maxi,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n=arr.size();
		HashMap<Integer,Integer>map=new HashMap<>();
		int sum=0;
		int maxi=0;
		for(int i=0;i<n;i++){
			sum+=arr.get(i);
			if(sum==0){
				maxi=i+1;
			}
			else{
				if(map.get(sum)!=null){
					maxi=Math.max(maxi,i-map.get(sum));
				}
				else{
					map.put(sum,i);
				}
			}
		}
		return maxi;
	}
}
