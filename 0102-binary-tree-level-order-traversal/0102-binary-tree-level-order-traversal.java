/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list1 = new ArrayList<>();

        lOrder(root, list1, 0);

        return list1;
    }

    public static void lOrder(TreeNode root, List<List<Integer>> list1, int level) {

        if (root == null) {
            return;
        }
        if (list1.size() <= level) {
            list1.add(new ArrayList<>());
        }
        list1.get(level).add(root.val);

        lOrder(root.left, list1, level + 1);
        lOrder(root.right, list1, level + 1);
    }

}