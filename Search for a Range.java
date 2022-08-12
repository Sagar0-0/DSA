public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        int[]ans=new int[2];
        ans[0]=A.length;
        ans[1]=-1;
        dfs(A,B,ans,0,A.length-1);
        if(ans[0]==A.length)ans[0]=-1;
        return ans;
    }
    void dfs(int[]a,int b,int[]ans,int i,int j){
        if(i<=j){
            int mid=i+(j-i)/2;
            if(a[mid]==b){
                ans[0]=Math.min(ans[0],mid);
                ans[1]=Math.max(ans[1],mid);
                dfs(a,b,ans,i,mid-1);
                dfs(a,b,ans,mid+1,j);
            }else if(a[mid]>b){
                dfs(a,b,ans,i,mid-1);
            }else{
                dfs(a,b,ans,mid+1,j);
            }
        }
    }
}
