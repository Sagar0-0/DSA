class Solution {
    public int minDistance(String word1, String word2) {
        
        char[] s1= word1.toCharArray();
        char[] s2 = word2.toCharArray();
        
        int[][] DP = new int[s1.length+1][s2.length+1];
        
        for (int i=s1.length-1;i>=0;--i){
            for (int j=s2.length-1;j>=0;--j){
                if(s1[i] == s2[j]){
                    DP[i][j]= 1+ DP[i+1][j+1];
                }else{
                    DP[i][j]=Math.max(DP[i+1][j],DP[i][j+1]);
                }
            }
        }
        
        return word1.length()+word2.length()-(2*DP[0][0]);
    }
    
    
}