class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        if(s.charAt(0)=='0'){
            return 0;
        }
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            if(s.charAt(i)!='0'){
                dp[i]+=dp[i-1];
            }
            int two=Integer.parseInt(s.substring(i-1,i+1));
            if(two>=10&&two<=26){
                if(i==1){
                    dp[i]++;
                }
                else{
                    dp[i]+=dp[i-2];
                }
                
            }
        }
        return dp[dp.length-1];
    }
}