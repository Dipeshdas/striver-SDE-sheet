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
    
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>a=new HashSet<>();
        return solve(root,k,a);
        
    }
    public boolean solve(TreeNode root,int k,HashSet<Integer>a){
        if(root==null) return false;

        if(solve(root.left,k,a)) return true;

        if(a.contains(k-root.val)) return true;

        a.add(root.val);

        return solve(root.right,k,a);
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		HashSet<Integer>a=new HashSet<>();
        return solve(root,k,a);
        
    }
    public static boolean solve(BinaryTreeNode root,int k,HashSet<Integer>a){
        if(root==null) return false;

        if(solve(root.left,k,a)) return true;

        if(a.contains(k-root.data)) return true;

        a.add(root.data);

        return solve(root.right,k,a);
    }
}

