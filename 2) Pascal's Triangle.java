//LEETCODE

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>prev=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    temp.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=temp;
            ans.add(temp);
        }
        return ans;
        
    }
}


//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>>ans=new ArrayList<>();
		ArrayList<Long>temp,prev=null;

		for(int i=0;i<n;i++){
			temp=new ArrayList<Long>();
			for(int j=0;j<=i;j++){
				if(j==0 || j==i){
					temp.add((long)1);
				}
				else{
					temp.add(prev.get(j-1)+prev.get(j));
				}
			}
			prev=temp;
			ans.add(temp);
		}
		return ans;
        
	}
}
