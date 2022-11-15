
class Tree {
    int sum;
    int cnt;
    int sum(Node root, int k) { 
        sum=0;
        cnt=0;
        dfs(root,k);
        return sum;
        // Code here
    } 
    void dfs(Node root,int k){
        if(root==null)return;
        dfs(root.left,k);
        if(cnt<k){
            sum+=root.data;
            cnt++;
        }
        if(cnt<k){
            dfs(root.right,k);
        }
    }
}
