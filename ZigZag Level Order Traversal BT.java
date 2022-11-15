/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        int p=0;
        
        while(!q.isEmpty())
        {
            int l = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<l;i++)
            {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
            if(p%2!=0)
                Collections.reverse(level);
            
            res.add(new ArrayList<Integer>(level));
            p++;
        }
        return res;
    }
}

