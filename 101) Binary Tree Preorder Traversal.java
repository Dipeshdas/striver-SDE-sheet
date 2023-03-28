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
    
    //Recursion
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer>l=new ArrayList<>();
    //     traverse(root,l);
    //     return l;
    // }
    
    // public void traverse(TreeNode root,List<Integer>l){
    //     if(root==null){
    //         return;
    //     }
    //     l.add(root.val);
    //     traverse(root.left,l);
    //     traverse(root.right,l);
        
    // }

    //iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;

        st.push(root);
        while(!st.isEmpty()){
            TreeNode top=st.peek();
            ans.add(top.val);
            st.pop();
            
            if(top.right!=null){
                st.push(top.right);
            }
            if(top.left!=null){
                st.push(top.left);
            }
        }
        return ans;
    }

}
