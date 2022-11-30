class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean[]filled=new boolean[1001];
        int[]freq=new int[2002];
        for(int i:arr){
            freq[i+1000]++;
        }
        for(int i:freq){
            if(i==0)continue;
            if(!filled[i]){
                filled[i]=true;
            }else{
                return false;
            }
        }
        return true;
    }
}