//LEETCODE

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ans;
         
         //2nd approach------------(2ms)

        // List<Integer>ar=new ArrayList<>();
        //inOrder(root,ar);        
        // return ar.get(k-1);
        
    }
    //2nd approach--------------(2ms)

    // public void inOrder(TreeNode root,List<Integer>ar){
    //     if(root==null) return;

    //     inOrder(root.left,ar);
    //     ar.add(root.val);
    //     inOrder(root.right,ar);

    // }
    public void inOrder(TreeNode root,int k){
        if(root==null) return;
        
        inOrder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        inOrder(root.right,k);

    }

}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		int ar[]=new int[2];
		ar[0]=0;//for count
		ar[1]=0;//for ans;

		inorder(root,k,ar);
		return ar[1];
	}

	public static void inorder(TreeNode<Integer> root, int k,int ar[]){
		if(root==null) return;

		inorder(root.left,k,ar);
		ar[0]++;
		if(ar[0]==k){
			ar[1]=root.data;
			return;
		}
		inorder(root.right,k,ar);
	}

}
