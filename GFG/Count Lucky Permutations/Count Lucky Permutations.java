//dp[i][j] = total no. of permutation that ends with i and contain all set bit of j
//i = node
//j = visited array like

class Solution {
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        // Code here
        long[][] dp=new long[N][1<<N];
        
        boolean[][]adj=new boolean[N][N];
        for(int i=0;i<M;i++){
            adj[graph[i][0]-1][graph[i][1]-1]=true;
            adj[graph[i][1]-1][graph[i][0]-1]=true;
        }
        
        for(int i=0;i<N;i++){
            dp[i][1<<i]=1;
        }
        
        for(int bitmask=1;bitmask<(1<<N);bitmask++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(i!=j && adj[arr[i]-1][arr[j]-1] && arr[i]!=arr[j]
                    && (1 & (bitmask>>j))>0){
                        dp[i][bitmask]+=dp[j][bitmask ^ (1<<i)];
                    }
                }
            }
        }
        
        long ans=0;
        for(int i=0;i<N;i++){
            ans+=dp[i][(1<<N)-1];
        }
        return ans;
        
    }
}
