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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Collect the leaf values from each tree
    List<Integer> leafValues1 = getLeafValues(root1, new ArrayList<>());
    List<Integer> leafValues2 = getLeafValues(root2, new ArrayList<>());
    
    // Compare the leaf value lists
    return leafValues1.equals(leafValues2);
    }
    List<Integer> getLeafValues(TreeNode node, List<Integer> values) {
        // If the node is null, return
        if (node == null) {
            return values;
        }
        
        // If the node is a leaf node, add its value to the list
        if (node.left == null && node.right == null) {
            values.add(node.val);
        }
        
        // Recursively traverse the left and right subtrees
        getLeafValues(node.left, values);
        getLeafValues(node.right, values);
        
        return values;
    }
}