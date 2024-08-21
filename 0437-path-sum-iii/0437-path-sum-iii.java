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
    long[] count = {0};


    public int pathSum(TreeNode root, int targetSum) {

        if(root == null){
            return (int)count[0];
        }
        pathSumList(root , (long)targetSum ,count);
        pathSum(root.left , targetSum);
        pathSum(root.right , targetSum);  
        return (int)count[0];
    }
    public static void pathSumList(TreeNode root , long targetSum ,long[] count){

        if(root == null){
            return;
        }

        if(targetSum - root.val == 0){
            count[0]++;
        }

        pathSumList(root.left , (long)targetSum - root.val , count);
        pathSumList(root.right , (long)targetSum - root.val , count);
    }
}