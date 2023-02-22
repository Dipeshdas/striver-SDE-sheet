//LEETCODE

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0) return false;

        int n=matrix.length;
        int m=matrix[0].length;

        //set the low value and high value by indices.
        int low=0,high=(n*m)-1;
        
        while(low<=high){
            int mid=(low+(high-low)/2);

            //calculating the (rowIndex,colIndex) where mid is right now.
            int rInd=mid / m;
            int cInd=mid % m;

            //Simple Binary Search
            if(matrix[rInd][cInd]==target){
                return true;
            }
            else if(matrix[rInd][cInd]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return false;
        
    }
}

//Code Studio

import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {

		//First approach---------
		// if(mat.size()==0) return false;

		// int low=0;
		// int high=(m*n)-1;
		// while(low<=high){
		// 	int mid=low+(high-low)/2;
		// 	if(mat.get(mid/n).get(mid%n)==target){
		// 		return true;
		// 	}
		// 	else if(mat.get(mid/n).get(mid%n)<target){
		// 		low=mid+1;
				
		// 	}
		// 	else{
		// 		high=mid-1;
		// 	}
		// }
		// return false;

		//Secoond approach-----------
		int low=0;
		int high=n-1;
		while(low<m && high>=0){
			if(mat.get(low).get(high)==target){
				return true;
			}
			else if(mat.get(low).get(high)<target){
				low++;
			}
			else{
				high--;
			}
		}
		return false;
	}
}
