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

    

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list1 = new ArrayList<>();
        postOrder(root , list1);
        return list1;
    }

    public static void postOrder(TreeNode root , List<Integer> list1){


        if(root == null){
            return;
        }

        postOrder(root.left , list1);
        postOrder(root.right , list1);
        list1.add(root.val);


    }
}
