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
    
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer>l=new ArrayList<>();
    //     traverse(root,l);
    //     return l;
    // }
    
    // public void traverse(TreeNode root,List<Integer>l){
    //     if(root==null){
    //         return;
    //     }
    //     traverse(root.left,l);
    //     traverse(root.right,l);
    //     l.add(root.val);
    // }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>st2=new Stack<>();

        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode temp=st1.peek();
            st1.pop();
            st2.push(temp);

            if(temp.left!=null) st1.push(temp.left);
            if(temp.right!=null) st1.push(temp.right);
        }

        while(!st2.isEmpty()){
            ans.add(st2.peek().val);
            st2.pop();
        }
        return ans;

    }


}
