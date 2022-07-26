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
        Set<TreeNode> set=new HashSet<>();
        map.put(root,null);
        dfs(root,map);
        
        TreeNode curr=p;
        while(curr!=null){
            set.add(curr);
            curr=map.get(curr);
        }
        curr=q;
        while(curr!=null){
            if(set.contains(curr)){
                return curr;
            }
            curr=map.get(curr);
        }
        return curr;
    }
    void dfs(TreeNode root,Map<TreeNode,TreeNode> map){
        if(root.left!=null){
            map.put(root.left,root);
            dfs(root.left,map);
        }
        if(root.right!=null){
            map.put(root.right,root);
            dfs(root.right,map);
        }
    }
}