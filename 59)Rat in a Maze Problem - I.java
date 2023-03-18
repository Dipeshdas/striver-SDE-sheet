//GFG
//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String>ans=new ArrayList<>();
        int vis[][]=new int[n][n];
        int delRow[]={1,0,0,-1};
        int delCol[]={0,-1,1,0};
        if(m[0][0]==1) solve(0,0,ans,m,n,vis,"",delRow,delCol);
        return ans;
    }
    
    public static void solve(int row,int col,ArrayList<String>ans,int[][] m,int n,int[][]vis,String str,int delRow[],int delCol[]){
        if(row==n-1 && col==n-1) {
            ans.add(str);
            return;
        }
        
        String dir="DLRU";
        for(int i=0;i<4;i++){
            int drow=row+delRow[i];
            int dcol=col+delCol[i];
            if(drow>=0 && drow<n && dcol>=0 && dcol<n && vis[drow][dcol]==0 && m[drow][dcol]==1){
                vis[row][col]=1;
                solve(drow,dcol,ans,m,n,vis,str+dir.charAt(i),delRow,delCol);
                vis[row][col]=0;
            }
        }
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int vis[][]=new int[n][n];
        solve(0,0,ans,maze,n,vis);
        return ans;
    }

    public static void insert(int[][]vis,ArrayList<ArrayList<Integer>>ans,int n){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp.add(vis[i][j]);
            }  
        }
        ans.add(temp);
    }

    public static void solve(int row,int col,ArrayList<ArrayList<Integer>>ans,int[][] m,int n,int[][]vis){
        if(row==n-1 && col==n-1) {
            vis[row][col]=1;
            insert(vis,ans,n);
            return;
        }

        if (row > n - 1 || row < 0 || col > n - 1 || col < 0){
            return;
        }

        if (m[row][col] == 0 || vis[row][col] == 1){
            return;
        }


        vis[row][col]=1;
        solve(row-1,col,ans,m,n,vis);
        solve(row+1,col,ans,m,n,vis);
        solve(row,col-1,ans,m,n,vis);
        solve(row,col+1,ans,m,n,vis);
        vis[row][col]=0;
    }
}
