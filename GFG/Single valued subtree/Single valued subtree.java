class Solution
{
    int ans;
    public int singlevalued(Node root)
    {
        //code here
        ans=0;
        dfs(root);
        return ans;
    }
    Integer dfs(Node root){
        if(root==null)return null;
        Integer lefty=dfs(root.left);
        Integer righty=dfs(root.right);
        if(lefty!=null && righty!=null && lefty==righty && lefty==root.data){
            ans++;
            return righty;
        }else if(root.left==null && root.right==null){
            ans++;
            return root.data;
        }else if(root.left==null && righty!=null && righty==root.data){
            ans++;
            return root.data;
        }else if(root.right==null && lefty!=null && lefty==root.data){
            ans++;
            return root.data;
        }
        return null;
    }
}
