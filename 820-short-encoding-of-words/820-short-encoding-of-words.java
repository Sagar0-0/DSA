class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->b.length()-a.length());
        StringBuilder ans=new StringBuilder();
        for(String s:words){
            if(ans.indexOf(s)==-1){
                ans.append(s);
                ans.append("#");
            }else{
                int idx=ans.lastIndexOf(s);
                int end=idx+s.length();
                if(ans.charAt(end)!='#'){
                    ans.append(s);
                    ans.append("#");
                }
            }
        }
        return ans.length();
    }
}