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
    
    public boolean isValidBST(TreeNode root) {
        return solve(root,Long.MIN_VALUE,Long.MAX_VALUE);    
    }

    public static boolean solve(TreeNode root,long min,long max){
        if(root==null) return true;

        if(root.val>=max || root.val<=min) return false;

        return solve(root.left,min,root.val) && solve(root.right,root.val,max);
    }

}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return solve(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean solve(BinaryTreeNode<Integer> root,int min,int max){
        if(root==null) return true;

        if(root.data>max || root.data<min) return false;

        return solve(root.left,min,root.data) && solve(root.right,root.data,max);
    }
}
