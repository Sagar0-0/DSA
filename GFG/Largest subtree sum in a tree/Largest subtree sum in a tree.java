class Solution {
    static int ans;
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans=Integer.MIN_VALUE;
        dfs(root);
        return ans;
    }
    static int dfs(Node root){
        int sum=root.data;
        if(root.left!=null){
            sum+=dfs(root.left);
        }
        if(root.right!=null){
            sum+=dfs(root.right);
        }
        ans=Math.max(ans,sum);
        return sum;
    }
}
