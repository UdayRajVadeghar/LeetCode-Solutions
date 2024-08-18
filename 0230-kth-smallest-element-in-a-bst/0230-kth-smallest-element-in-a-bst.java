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
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack1 = new Stack<>();

        while(root != null || !stack1.isEmpty()){

            while(root != null){

                stack1.push(root);
                root = root.left;
            }

            root = stack1.pop();
            k--;
            if(k == 0){
                return root.val;
            }
            root = root.right;

        }

        return -1;




        
    }
}