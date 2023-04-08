//CODE STUDIO
import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	
	public static boolean isLeaf(TreeNode node){
		return (node.left==null) && (node.right==null);
	}
	
	public static void addLeftNode(TreeNode root,ArrayList<Integer>ans){
		TreeNode cur=root.left;
		while(cur!=null){
			if(isLeaf(cur)==false) ans.add(cur.data);
			if(cur.left!=null) cur=cur.left;
			else cur=cur.right;
		}
		
		
	}

	public static void addLeafNode(TreeNode root,ArrayList<Integer>ans){
		if(isLeaf(root)){
			ans.add(root.data);
			return;
		}
		
		if(root.left!=null) addLeafNode(root.left,ans);
		if(root.right!=null) addLeafNode(root.right,ans);
		
	}
	
	public static void addRightNode(TreeNode root,ArrayList<Integer>ans){
		TreeNode cur=root.right;
		Stack<Integer>st=new Stack<>();
		while(cur!=null){
			if(isLeaf(cur)==false) st.push(cur.data);
			if(cur.right!=null) cur=cur.right;
			else cur=cur.left;
		}

		while(!st.isEmpty()){
			ans.add(st.pop());
		}
		
	}
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		ArrayList<Integer>ans=new ArrayList<>();
		if (isLeaf(root) == false) ans.add(root.data);
		addLeftNode(root,ans);
		addLeafNode(root,ans);
		addRightNode(root,ans);
		return ans;
	}
}
