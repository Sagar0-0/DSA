class Pair{
    int i;
    int j;
    int dist;
    Pair(int i,int j,int d){
        this.i=i;
        this.j=j;
        this.dist=d;
    }
}
class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int[] x=new int[]{1,1,2,2,-1,-1,-2,-2};
        int[]y=new int[]{2,-2,1,-1,2,-2,1,-1};
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(KnightPos[0],KnightPos[1],0));
        boolean [][]vis=new boolean[N+1][N+1];
        vis[KnightPos[0]][KnightPos[1]]=true;
        while(q.size()>0){
            int sz=q.size();
            while(sz-->0){
                Pair curr=q.remove();
                int i=curr.i;
                int j=curr.j;
                int dist=curr.dist;
                if(i==TargetPos[0] && j==TargetPos[1])return dist;
                for(int k=0;k<8;k++){
                    if(isValid(i+x[k],j+y[k],vis,N)){
                        q.add(new Pair(i+x[k],j+y[k],dist+1));
                        vis[i+x[k]][j+y[k]]=true;
                    }
                }
            }
        }
        return -1;
    }
    boolean isValid(int i,int j,boolean[][]vis,int N){
        if(i<1 || j<1 || i>N || j>N || vis[i][j]){
            return false;
        }
        return true;
    }
}
