class Solution {
    public String getSmallestString(int n, int k) {
        if(n==0)return "";
        if(n==1)return charr(k)+"";
        char[] ans=new char[n];
        for(int i=n-1;i>=0;i--){
            int selected=26;
            while(k-selected<n-1 && selected>1){
                selected--;
            }
            n--;
            k-=selected;
            ans[i]=charr(selected);
        }
        return new String(ans);
    }
    public char charr(int k){
        return (char)(k+96);
    } 
}