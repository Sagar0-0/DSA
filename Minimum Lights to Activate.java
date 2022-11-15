public class Solution {
    public int solve(int[] a, int b) {
        int n=a.length;
        int i=0,curr=-1;
        int cnt=0;
        while(i<n){
            curr=-1;
            for(int j=Math.max(0,i-b+1);j<Math.min(n,i+b);j++){
                if(a[j]==1)
                    curr=j;
            }
            if(curr==-1){
                return -1;
            }
            cnt++;
            i=curr+b;
        }
        return cnt;
    }
}
