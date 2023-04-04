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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new LinkedList<>();
        
        if(root==null){
            return ans;
        }
        
        Queue<TreeNode>n=new LinkedList<>();
        n.add(root);
        while(!n.isEmpty()){
            List<Integer>l=new ArrayList<>();
            int count=n.size();
            for(int i=0;i<count;i++){
                TreeNode cur=n.poll();
                l.add(cur.val);
                if(cur.left!=null){
                    n.add(cur.left);
                }
                if(cur.right!=null){
                    n.add(cur.right);
                }
                
            }
            
            ans.add(l);
        }
        return ans;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
	  ArrayList<Integer>ans=new ArrayList<>();
	  Queue<BinaryTreeNode>q=new LinkedList<>();
	  if(root==null) return ans;
	  q.add(root);
	  while(!q.isEmpty()){
		  BinaryTreeNode node=q.poll();
		  ans.add(node.val);
		  if(node.left != null) 
                q.add(node.left);
                
            if(node.right != null) 
                q.add(node.right);

		  
	  }
	  return ans;
  }

}
