import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> largestValues(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();

        queue1.add(root);

        while (!queue1.isEmpty()) {

            int length = queue1.size();
            List<Integer> list2 = new ArrayList<>();
            int largest = Integer.MIN_VALUE; 

            for (int i = 0; i < length; i++) {
                TreeNode current = queue1.poll();

                if (current.left != null) {
                    queue1.offer(current.left);
                }
                if (current.right != null) {
                    queue1.offer(current.right);
                }

                largest = Math.max(largest, current.val);
            }

            list1.add(largest);
        }
        return list1;
    }
}
