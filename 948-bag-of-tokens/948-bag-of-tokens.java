class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int ans=0;
        int curr=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                curr++;
                ans=Math.max(ans,curr);
                i++;
            }else{
                if(curr==0)break;
                power+=tokens[j];
                curr--;
                j--;
            }
        }
        return ans;
    }
}