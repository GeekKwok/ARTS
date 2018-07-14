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
         List<Integer> set = new ArrayList();
         return dfs(set, root, k);
     }

     private boolean dfs(List<Integer> set, TreeNode node, int target) {
         if (node != null) {
             if (set.contains(target - node.val)) {
                 return true;
             }
             set.add(node.val);
             if (dfs(set, node.left, target)) {
                 return true;
             }
             if (dfs(set, node.right, target)) {
                 return true;
             }
         }
         return false;
     }
 }
