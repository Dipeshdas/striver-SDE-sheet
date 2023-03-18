//GFG

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int color[]=new int[n];
        return solve(0,graph,color,m,n);
    }
    
    public boolean solve(int node,boolean graph[][],int color[], int m, int n){
        if(node==n) return true;
        for(int i=1;i<=m;i++){
            if(isPossible(graph,color,node,i,n)){
                color[node]=i;
                if(solve(node+1,graph,color,m,n)) return true;
                else color[node]=0;
                
            }
        }
        return false;
        
    }
    
    public boolean isPossible(boolean graph[][],int color[],int node,int col,int n){
        for(int i=0;i<n;i++){
            if(graph[node][i] && color[i]==col){
                return false;
            }
        }
        return true;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution {
	public static String graphColoring(int[][] mat, int m) {
		int n=mat.length;
		int color[]=new int[n];
        return solve(0,mat,color,m,n);
	}

	public static String solve(int node,int graph[][],int color[], int m, int n){
        if(node==n) return "YES";
        for(int i=1;i<=m;i++){
            if(isPossible(graph,color,node,i,n)){
                color[node]=i;
                if(solve(node+1,graph,color,m,n)=="YES") return "YES";
                else color[node]=0;
                
            }
        }
        return "NO";
        
    }
    
    public static boolean isPossible(int graph[][],int color[],int node,int col,int n){
        for(int i=0;i<n;i++){
            if(graph[node][i]==1 && color[i]==col){
                return false;
            }
        }
        return true;
    }
}
