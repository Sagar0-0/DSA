class Solution {
    public int maxSumSubmatrix(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        
        //create prefix sum array
        int[][]pre=new int[n][m];
        pre[0][0]=mat[0][0];
        for(int i=1;i<n;i++){
            pre[i][0]=mat[i][0]+pre[i-1][0];
        }
        for(int i=1;i<m;i++){
            pre[0][i]=mat[0][i]+pre[0][i-1];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                pre[i][j]=mat[i][j]+pre[i][j-1]+pre[i-1][j]-pre[i-1][j-1];
            }
        }
        
        //find all rect from one point and store the max sum <=k
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    for(int x=i;x<n;x++){
                        for(int y=j;y<m;y++){
                            if(pre[x][y]<=k){
                                ans=Math.max(ans,pre[x][y]);
                            }
                        }
                    }
                }else if(i==0){
                    for(int x=i;x<n;x++){
                        for(int y=j;y<m;y++){
                            int sum=pre[x][y]-pre[x][j-1];
                            if(sum<=k){
                                ans=Math.max(ans,sum);
                            }
                        }
                    }
                }else if(j==0){
                    for(int x=i;x<n;x++){
                        for(int y=j;y<m;y++){
                            int sum=pre[x][y]-pre[i-1][y];
                            if(sum<=k){
                                ans=Math.max(ans,sum);
                            }
                        }
                    }
                }else{
                    for(int x=i;x<n;x++){
                        for(int y=j;y<m;y++){
                            int sum=pre[x][y]-pre[i-1][y]-pre[x][j-1]+pre[i-1][j-1];
                            if(sum<=k){
                                ans=Math.max(ans,sum);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}