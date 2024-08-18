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

        List<Integer> list1 = new ArrayList<>();

        inOrder(root , list1);
        return list1;

        
    }
    public static void inOrder(TreeNode root , List<Integer> list1){

        if(root == null){
            return;
        }

        inOrder(root.left , list1);
        list1.add(root.val);
        inOrder(root.right , list1);

    }
}