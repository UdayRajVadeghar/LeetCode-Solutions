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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();

        pathSumList(root , targetSum , list1 , list2);
        return list1;

        
    }
    public static void pathSumList(TreeNode root , int targetSum , List<List<Integer>> list1 , List<Integer> list2){

        if(root == null){
            return;
        }
        list2.add(root.val);

        if((root.left == null && root.right == null) && targetSum - root.val == 0){

            list1.add(new ArrayList(list2));
        }

        pathSumList(root.left , targetSum - root.val, list1 , list2);
        pathSumList(root.right, targetSum - root.val, list1 , list2);
        list2.removeLast();



    }


}