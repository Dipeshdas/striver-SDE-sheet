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
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     Stack<TreeNode> st=new Stack<>();
        
    //     List<Integer>ans=new ArrayList<>();
    //     if(root==null) return ans;

    //     st.push(root);
    //     while(!st.isEmpty()){
    //         TreeNode top=st.peek();
    //         ans.add(top.val);
    //         st.pop();
            
    //         if(top.right!=null){
    //             st.push(top.right);
    //         }
    //         if(top.left!=null){
    //             st.push(top.left);
    //         }
    //     }
    //     return ans;
    // }
    

    //Morris Traversal(T.C- O(N) S.C-O(1))
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                l.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode pred=Predecessor(cur);
                if(pred.right==null){
                    pred.right=cur;
                    l.add(cur.val);
                    cur=cur.left;
                }
                else{
                    pred.right=null;
                    cur=cur.right;
                }
            }
        }
        return l;
    }

    public TreeNode Predecessor(TreeNode cur){
        TreeNode temp=cur.left;
        while(temp.right!=null && temp.right!=cur){
            temp=temp.right;
        }
        return temp;
    }


}
