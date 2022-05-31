class Solution {
    public boolean hasAllCodes(String s, int k) {
        boolean[] vis=new boolean[(int)Math.pow(2,k)];
        int n=s.length();
        for(int i=0;i<=n-k;i++){
            int j=i+k;
            int num=Integer.parseInt(s.substring(i,j),2);
            vis[num]=true;
        }
        for(boolean bool:vis){
            if(!bool)return false;
        }
        return true;
    }
}