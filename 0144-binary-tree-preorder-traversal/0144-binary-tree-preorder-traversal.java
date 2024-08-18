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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list1 = new ArrayList<>();

        preOrder(root , list1);

        return list1;
        
    }
    public static void preOrder(TreeNode root , List<Integer> list1){

        if(root == null){
            return;
        }
        list1.add(root.val);
        preOrder(root.left , list1);
        preOrder(root.right , list1);
    }
}