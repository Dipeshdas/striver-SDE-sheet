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
    public TreeNode searchBST(TreeNode root, int val) {
        //RECURSIVE SOLUTION

        // if(root==null){
        //     return root;
        // }
        // if(root.val==val){
        //     return root;
        // }
        // if(val<root.val){
        //     return searchBST(root.left,val);
        // }
        // return searchBST(root.right,val);

        //ITERATIVE SOLUTION

        while(root!=null && root.val!=val){
            if(val<root.val) root=root.left;
            else root=root.right;
        }
        return root;
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/

public class Solution {
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {


		while(root!=null && root.data!=x){
			if(x<root.data) root=root.left;
			else{
				root=root.right;
			}
		}

		if(root!=null && root.data==x) return true;
		return false;
	}
}
