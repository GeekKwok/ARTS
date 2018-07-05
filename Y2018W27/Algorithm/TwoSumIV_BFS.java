/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        return bsf(root, k);
    }

    private boolean bsf(TreeNode node, int target) {
        List<Integer> set = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(node);
        set.add(node.val);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            if (tempNode.left != null) {
                queue.add(tempNode.left);
                if (set.contains(target - tempNode.left.val)) {
                    return true;
                }
                set.add(tempNode.left.val);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
                if (set.contains(target - tempNode.right.val)) {
                    return true;
                }
                set.add(tempNode.right.val);
            }
        }

        return false;
    }
}
