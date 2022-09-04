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
    Map<Integer,PriorityQueue<int[]>> map;
    int min;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map=new HashMap<>();
        min=Integer.MAX_VALUE;
        dfs(root,0,0);
        List<List<Integer>> ans=new ArrayList<>();
        while(map.containsKey(min)){
            PriorityQueue<int[]>pq=map.get(min);
            List<Integer> ls=new ArrayList<>();
            while(pq.size()>0){
                ls.add(pq.remove()[0]);
            }
            ans.add(ls);
            min++;
        }
        return ans;
    }
    void dfs(TreeNode root,int row,int col){
        if(root==null)return;
        min=Math.min(min,col);
        PriorityQueue<int[]> pq;
        if(map.containsKey(col)){
            pq=map.get(col);
        }else{
            pq=new PriorityQueue<>((a,b)->{
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            });
        }
        pq.add(new int[]{root.val,row});
        map.put(col,pq);
        dfs(root.left,row+1,col-1);
        dfs(root.right,row+1,col+1);
    }
}