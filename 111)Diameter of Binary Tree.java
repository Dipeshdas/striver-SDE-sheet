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
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];  
    }
    public int height(TreeNode node,int[]diameter){
        if (node == null) {
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}

// CODE STUDIO
/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		int diameter[]=new int[1];
		height(root,diameter);
		return diameter[0];
	}

	public static int height(TreeNode<Integer> root,int[] diameter){
		if(root==null) return 0;
		 int lh=height(root.left,diameter);
		 int rh=height(root.right,diameter);
		 diameter[0]=Math.max(diameter[0],lh+rh);

		 return 1+Math.max(lh,rh);

	}
}
