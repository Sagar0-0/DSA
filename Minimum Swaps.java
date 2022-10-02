class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        // code here
        int slow=0;
        int totalSwaps=0;
        for(int i=n-1;i>=0;i--){
            int pos=c[i]+(v[i]*t);
            if(pos>=b){
                k--;
                totalSwaps+=slow;
                if(k==0)return totalSwaps;
            }else{
                slow++;
            }
        }
        
        return -1;
    }
}
