class Solution {
    public int maximumUnits(int[][] a, int n) {
        Arrays.sort(a,(ob1,ob2)->ob2[1]-ob1[1]);
        int i=0;
        int ans=0;
        while(n>0 && i<a.length){
            int curr=n;
            if(a[i][0]<curr){
                curr=a[i][0];
                ans+=(a[i][1]*curr);
                i++;
            }else{
                ans+=(a[i][1]*curr);
            }
            n-=curr;
        }
        return ans;
    }
}