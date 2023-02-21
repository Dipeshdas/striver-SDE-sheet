import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int freq[]=new int[arr.size()+1];
        for(int i=0;i<arr.size();i++){
            freq[arr.get(i)] ++;
        }
        int ans[]=new int[2];
        for(int i=1;i<=arr.size();i++){
            if(freq[i]==0){
                ans[0]=i;
            }
            if(freq[i]>1){
                ans[1]=i;
            }
        }
        return ans;
    }
}
