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


        sums(root , targetSum , list2 , list1);
        return list1;

        
        
    }
    public static void sums(TreeNode root , int targetSum , List<Integer> list2 , List<List<Integer>> list1){

        if(root == null){
            return;
        }
        list2.add(root.val);
        if((root.left == null && root.right == null) && (targetSum-root.val == 0)){ 
            list1.add(new ArrayList<>(list2));
        }
        
        sums(root.left,targetSum - root.val , list2 , list1);
        sums(root.right , targetSum - root.val , list2 , list1);
        list2.remove(list2.size()-1);
        

    }
}