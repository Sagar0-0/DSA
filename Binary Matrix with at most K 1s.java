class Solution {
    static ArrayList<Integer> largestSquare(ArrayList<ArrayList<Integer>> M, int R, int C, int K, int Q, int[] q_i, int[] q_j) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int[][]dp=new int[R][C];
        dp[0][0]=M.get(0).get(0);
        
        for(int i=1;i<R;i++){
            dp[i][0]=dp[i-1][0]+M.get(i).get(0);
        }
        for(int j=1;j<C;j++){
            dp[0][j]=dp[0][j-1]+M.get(0).get(j);
        }
        for(int i=1;i<R;i++){
            for(int j=1;j<C;j++){
                dp[i][j]=M.get(i).get(j)+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
        
        
        for(int q=0;q<Q;q++){
            int i=q_i[q];
            int j=q_j[q];
            int min_dist=Math.min(Math.min(i,j),Math.min(R-1-i,C-1-j));
            int curr=0;
            int l=0;
            int h=min_dist;
            while(l<=h){
                int k=(l+h)/2;
                int x1=i-k;
                int y1=j-k;
                int x2=i+k;
                int y2=j+k;
                int count=dp[x2][y2];
                if(y1>0)count-=dp[x2][y1-1];
                if(x1>0)count-=dp[x1-1][y2];
                if(x1>0 && y1>0)count+=dp[x1-1][y1-1];
                
                if(count<=K){
                    curr=2*k+1;
                    l=k+1;
                }else{
                    h=k-1;
                }
            }
            ans.add(curr);
        }
        return ans;
    }
};
