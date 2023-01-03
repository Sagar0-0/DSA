class Solution {
    public int minDeletionSize(String[] strs) {
        int cols=strs[0].length();
        int ans=0;
        for(int col=0;col<cols;col++){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i+1].charAt(col)<strs[i].charAt(col)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}