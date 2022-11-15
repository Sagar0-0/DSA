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
    int min;
    int max;
    public ArrayList<Integer> verticalSum(TreeNode A) {
        min=Integer.MAX_VALUE;
        max=Integer.MIN_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        dfs(A,map,0);
        while(min<=max){
            arr.add(map.get(min));
            min++;
        }
        return arr;
    }
    public void dfs(TreeNode a,Map<Integer,Integer> map,int curr){
        if(a==null)return;
        map.put(curr,map.getOrDefault(curr,0)+a.val);
        min=Math.min(min,curr);
        max=Math.max(max,curr);
        dfs(a.left,map,curr-1);
        dfs(a.right,map,curr+1);
    }
}
