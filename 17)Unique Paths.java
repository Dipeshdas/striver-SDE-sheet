//LEETCODE

class Solution {
    //DP solution.

    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             dp[i][j]=-1;
    //         }
    //     }
    //     return solve(0,0,m,n,dp);
    // }
    // public int solve(int i,int j,int m,int n,int dp[][]){
    //     if(i>=m || j>=n) return 0;
    //     if(i==m-1 && j==n-1) return 1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     else return dp[i][j]=solve(i+1,j,m,n,dp)+solve(i,j+1,m,n,dp);
    // }

    public int uniquePaths(int m, int n) {
       int N=m+n-2;
       int r=n-1;
       double res=1;
       for(int i=1;i<=r;i++){
           res=res*(N-r+i)/i;
       }
       return (int)res;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
		return solve(0,0,m,n,dp);
	}
	public static int solve(int i,int j,int m,int n,int dp[][]){
		if(i>=m || j>=n) return 0;
		if(i==m-1 && j==n-1) return 1;
		if(dp[i][j]!=-1) return dp[i][j];
		else return dp[i][j]=solve(i+1,j,m,n,dp)+solve(i,j+1,m,n,dp);
	}
}
