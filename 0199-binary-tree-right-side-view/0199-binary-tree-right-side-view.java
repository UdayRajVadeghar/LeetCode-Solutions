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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list1 = new ArrayList<>();

        rightView(root , 1 , list1);

        return list1;
        
    }
    public static void rightView(TreeNode root , int depth , List<Integer> list1){

        if(root == null){
            return;
        }
        if(depth > list1.size()){
            list1.add(root.val);
        }
        rightView(root.right , depth+1 , list1);
        rightView(root.left , depth+1 , list1);

    }
}