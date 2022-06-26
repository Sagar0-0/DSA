class Solution {
    public int maxScore(int[] a, int k) {
        int ans=0;
        int total=0;
        int n=a.length;
        int size=n-k;
        for(int i:a)total+=i;
        int i=0;
        int j=size-1;
        int currSum=sum(a,i,j);
        while(j<a.length-1){
            ans=Math.max(ans,total-currSum);
            currSum-=a[i];
            i++;
            j++;
            currSum+=a[j];
        }
        ans=Math.max(ans,total-currSum);
        return ans;
        
    }
    public int sum(int[]a,int i,int j){
        int s=0;
        while(i<=j){
            s+=a[i];
            i++;
        }
        return s;
    }
}