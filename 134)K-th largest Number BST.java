import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		int ar[]=new int[2];
		ar[0]=0;//for count
		ar[1]=-1;//for ans;

		inorder(root,k,ar);
		return ar[1];
	}

	public static void inorder(TreeNode<Integer> root, int k,int ar[]){
		if(root==null) return;

		inorder(root.right,k,ar);
		ar[0]++;
		if(ar[0]==k){
			ar[1]=root.data;
			return;
		}
		inorder(root.left,k,ar);
	}
}
