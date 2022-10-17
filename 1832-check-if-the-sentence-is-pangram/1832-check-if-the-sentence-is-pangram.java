class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] vis=new boolean[26];
        for(char c:s.toCharArray()){
            vis[c-'a']=true;
        }
        for(boolean b:vis)if(!b)return b;
        return true;
    }
}