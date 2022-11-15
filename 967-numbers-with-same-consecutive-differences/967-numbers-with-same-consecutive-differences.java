class Solution {
    List<Integer> ans;
    public int[] numsSameConsecDiff(int n, int k) {
        ans=new ArrayList<>();
        for(int i=1;i<10;i++){
            dfs(i,n,k);
        }
        int[] arr=new int[ans.size()];
        int i=0;
        for(int ele:ans){
            arr[i++]=ele;
        }
        return arr;
    }
    void dfs(int num,int n,int k){
        if((int)Math.floor(Math.log10(num) + 1)==n){
            ans.add(num);
            return;
        }
        int last=num%10;
        if(k==0){
            dfs(num*10+(last+k),n,k);
            return;
        }
        if(last+k<10){
            dfs(num*10+(last+k),n,k);
        }
        if(last-k>-1){
            dfs(num*10+(last-k),n,k);
        }
    }
}