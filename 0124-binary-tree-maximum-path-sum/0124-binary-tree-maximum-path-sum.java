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

    private static int maxSum;

    public int maxPathSum(TreeNode root) {
        
        maxSum = Integer.MIN_VALUE;
        recurse(root);

        return maxSum;
        
    }
    public static int recurse(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = Math.max(0 , recurse(root.left));
        int right = Math.max( 0 , recurse(root.right));

        int currentSum = left + right + root.val;

        maxSum = Math.max(maxSum , currentSum);

        return root.val + Math.max(left , right);

    }
}