import java.util.ArrayList;
import java.util.List;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        return hasPathSum(root.right , targetSum  - root.val) || hasPathSum(root.left , targetSum - root.val);

        
        
    }

    
}