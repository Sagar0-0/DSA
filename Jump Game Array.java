public class Solution {
    public int canJump(int[] A) {
        int n=A.length;
        boolean[] vis=new boolean[n];
        vis[0]=true;
        dfs(vis,A,0);
        return vis[n-1]?1:0;
    }
    public void dfs(boolean[]vis,int[]A,int idx){
        if(A[idx]==0)return;
        int max=idx+A[idx];
        int i=idx+1;
        while(i<A.length && i<=max){
            if(vis[i]==false){
                dfs(vis,A,i);
                vis[i]=true;
            }
            i++;
        }
    }
}
