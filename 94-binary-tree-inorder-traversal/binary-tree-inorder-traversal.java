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
    public List<Integer> inorderTraversal(TreeNode root) {
        BinaryTree bt = new BinaryTree();
        bt.inorder(root);
        return bt.ans;
    }
}

class BinaryTree{

    ArrayList<Integer> ans = new ArrayList<>();

    public void inorder(TreeNode root){

        if(root ==  null){
            return;
        }

        if(root.left == null){
            ans.add(root.val);
            if(root.right != null){
                inorder(root.right);
            }
            return;
        }

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}