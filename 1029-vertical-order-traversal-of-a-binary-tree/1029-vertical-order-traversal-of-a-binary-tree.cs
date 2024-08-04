

public class Solution {
    public IList<IList<int>> VerticalTraversal(TreeNode root) {
        var map = new SortedDictionary<int, SortedDictionary<int, List<int>>>();
        Traverse(root, 0, 0, map);

        var result = new List<IList<int>>();

        foreach (var xDict in map.Values) {
            var level = new List<int>();
            foreach (var yList in xDict.Values) {
                yList.Sort();
                level.AddRange(yList);
            }
            result.Add(level);
        }

        return result;
    }

    private void Traverse(TreeNode node, int x, int y, SortedDictionary<int, SortedDictionary<int, List<int>>> map) {
        if (node == null) {
            return;
        }

        if (!map.ContainsKey(x)) {
            map[x] = new SortedDictionary<int, List<int>>();
        }
        if (!map[x].ContainsKey(y)) {
            map[x][y] = new List<int>();
        }

        map[x][y].Add(node.val);

        Traverse(node.left, x - 1, y + 1, map);
        Traverse(node.right, x + 1, y + 1, map);
    }
}
