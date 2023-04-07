//LEETCODE
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q || root==null) return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null) return right;
        else if(right==null) return left;

        return root;
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution 
{
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
        if(root==null) return -1;

        if(root.data==y || root.data==x ) return root.data;

        int left=lowestCommonAncestor(root.left,x,y);
        int right=lowestCommonAncestor(root.right,x,y);

        if(left==-1) return right;
        else if(right==-1) return left;

        return root.data;

    }

}
