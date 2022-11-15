class Solution{
    public static int count=0;
    public static int dfs(Node root){
        if(root==null)return 1;
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(left==-1 || right==-1){
            count++;
            return 0;
        }
        if(left==0 || right==0){
            return 1;
        }
        return -1;
    }
    public static int supplyVaccine(Node root){
        count=0;
        if(dfs(root)==-1){
            count++;
        }
        return count;
    }
    // 0 = no vaccine needed
    // -1 = need vaccine
    /// 1 = giving vaccine
    
}
