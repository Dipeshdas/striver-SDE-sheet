//CODE STUDIO

import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static void changeTree(BinaryTreeNode < Integer > root) {
        if(root==null) return;
        int change=0;
        if(root.left!=null) change+=root.left.data;
        if(root.right!=null) change+=root.right.data;

        if(root.data<change) root.data=change;
        else{
            if(root.left!=null) root.left.data=root.data;
            else if(root.right!=null) root.right.data=root.data;
        }

        changeTree(root.left);
        changeTree(root.right);

        int newData=0;
        if(root.left!=null) newData+=root.left.data;
        if(root.right!=null) newData+=root.right.data;
        if(root.left!=null || root.right!=null) root.data=newData;
    }
}
