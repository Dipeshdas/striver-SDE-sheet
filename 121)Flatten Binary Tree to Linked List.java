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
    public void flatten(TreeNode root) {
        TreeNode cur=root;
        
        while(cur!=null){
            if(cur.left!=null){
                //
                TreeNode pred=cur.left;
                while(pred.right!=null){
                    pred=pred.right;
                }
                //link left part to right
                pred.right=cur.right;
                //link root node to left
                cur.right=cur.left;
                
                cur.left=null;
            }
            cur=cur.right;
        }
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

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
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        TreeNode<Integer> cur=root;
        
        while(cur!=null){
            if(cur.left!=null){
                //
                TreeNode pred=cur.left;
                while(pred.right!=null){
                    pred=pred.right;
                }
                //link left part to right
                pred.right=cur.right;
                //link root node to left
                cur.right=cur.left;
                
                cur.left=null;
            }
            cur=cur.right;
        }

		return root;
    }
}
