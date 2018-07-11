class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return dsf(root, k);
    }

    private boolean dsf(TreeNode node, int target) {
        List<Integer> set = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.peek();
            stack.pop();
            if (set.contains(target - treeNode.val)) {
                return true;
            }
            set.add(treeNode.val);
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }

        return false;
    }
}
