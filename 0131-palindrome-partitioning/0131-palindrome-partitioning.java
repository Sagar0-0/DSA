class Solution {
     public List<List<String>> partition(String s) {
        List<List<String>> Al1 = new ArrayList<>();
        List<String> Al2 = new ArrayList<>();
        String[][] dp = new String[s.length()][s.length()]; 
        palPart(Al1,Al2,s,0,dp);
        return Al1;
    }
    
    public void palPart(List<List<String>> Al1, List<String> Al2,String s, int start,String[][] dp){
        if (start == s.length())
            Al1.add(new ArrayList<>(Al2));
        
        for (int i=start;i<s.length();i++)
        {
            if (dp[start][i] != null){
                Al2.add(dp[start][i]); 
                palPart(Al1,Al2,s,i+1,dp);
                dp[start][i] = Al2.remove(Al2.size()-1);
            }else if (isPalindrome(start,i,s)){
                Al2.add(s.substring(start,i+1)); 
                palPart(Al1,Al2,s,i+1,dp);
                dp[start][i] = Al2.remove(Al2.size()-1);
            }
        }
        
    }
    
    public boolean isPalindrome(int start, int i, String s)
    {
        while (start < i)
        {
            if (s.charAt(start++) != s.charAt(i--)) return false;
        }
        return true;
    }
}