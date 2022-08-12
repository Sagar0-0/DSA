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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        map.put(root,null);
        dfs(root,map);
        Set<TreeNode> set=new HashSet<>();
        while(p!=null){
            set.add(p);
            p=map.get(p);
        }
        while(q!=null){
            if(set.contains(q))return q;
            set.add(q);
            q=map.get(q);
        }
        return null;
    }
    void dfs(TreeNode curr,Map<TreeNode,TreeNode> map){
        if(curr.left!=null){
            map.put(curr.left,curr);
            dfs(curr.left,map);
        }
        if(curr.right!=null){
            map.put(curr.right,curr);
            dfs(curr.right,map);
        }
    }
}