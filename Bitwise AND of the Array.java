class Solution {
    int count(int N, int A[], int X){
        int p=0;
        int ans=N;
        for(int i=31;i>=0;i--){
            int bit=(X>>i)&1;
            if(bit==1){
                p=p|(1<<i);
            }else{
                int temp=p|(1<<i);
                int cnt=0;
                for(int ele:A){
                    if((ele&temp)==temp){
                        cnt++;
                    }
                }
                ans=Math.min(ans,N-cnt);
            }
        }
        return ans;
    }
} 
