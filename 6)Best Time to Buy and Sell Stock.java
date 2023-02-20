//LEETCODE
class Solution {
    public int maxProfit(int[] prices) {

        //T.C-O(N^2)
        // int max=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         max=Math.max(max,prices[j]-prices[i]);
        //     }
        // }
        // return max;

        //T.C-O(N)
        int minSoFar=prices[0];
        int maxProfit=0;
        
        for(int i=1;i<prices.length;i++){
            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}

// CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.size();i++){
            min=Math.min(min,prices.get(i));
            int profit=prices.get(i)-min;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
