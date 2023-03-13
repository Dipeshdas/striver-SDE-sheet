//CODE STUDIO

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=num.length;
        solve(0,0,ans,num,n);
        Collections.sort(ans);
        return ans;
    }

    public static void solve(int ind,int sum,ArrayList<Integer>ans,int num[],int n){
        if(ind==n){
            ans.add(sum);
            return;
        }

        solve(ind+1,sum+num[ind],ans,num,n);
        solve(ind+1,sum,ans,num,n);
    }

}

//GFG

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends
//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer>ans=new ArrayList<>();
        solve(0,0,ans,N,arr);
        Collections.sort(ans);
        return ans;
    }
    
    void solve(int ind,int sum,ArrayList<Integer>ans,int N,ArrayList<Integer> arr){
        if(ind==N){
            ans.add(sum);
            return;
        }
        //pick the element
        solve(ind+1,sum+arr.get(ind),ans,N,arr);
        
        //not picking the element
        solve(ind+1,sum,ans,N,arr);
        
    }
}
