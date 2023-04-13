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

public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
        int floor=-1;
        while(root!=null){
            if(root.data==X){
                return root.data;
            }
            if(root.data<X){
                floor=root.data;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return floor;
    }
}
