//GFG

//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>max){
                max=arr[i].deadline;
            }
        }
        
        int []ans=new int[max+1];
        for(int i=1;i<=max;i++){
            ans[i]=-1;
        }
        
        int noOfJobs=0;
        int totalProfit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(ans[j]==-1){
                    ans[j]=i;
                    totalProfit+=arr[i].profit;
                    noOfJobs++;
                    break;
                }
            }
        }
        int []res=new int[2];
        res[0]=noOfJobs;
        res[1]=totalProfit;
        return res;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
    
        int n=jobs.length;
        Arrays.sort(jobs,(a,b)->(b[1]-a[1]));
        int max=0;
        for(int i=0;i<n;i++){
            if(jobs[i][0]>max){
                max=jobs[i][0];
            }
        }
        
        int []ans=new int[max+1];
        for(int i=1;i<=max;i++){
            ans[i]=-1;
        }
        
        int noOfJobs=0;
        int totalProfit=0;
        for(int i=0;i<n;i++){
            for(int j=jobs[i][0];j>0;j--){
                if(ans[j]==-1){
                    ans[j]=i;
                    totalProfit+=jobs[i][1];
                    noOfJobs++;
                    break;
                }
            }
        }
        return totalProfit;
    }
}
