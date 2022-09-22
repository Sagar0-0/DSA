class Solution {
    public String reverseStr(String s, int k) {
        boolean rev=true;
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<s.length()){
            if(i+k>s.length()){    
                if(rev){
                    StringBuilder sb=new StringBuilder(s.substring(i));
                    sb.reverse();
                    ans.append(sb);
                }else{
                    ans.append(s.substring(i));
                }
            }else{
                if(rev){
                    StringBuilder sb=new StringBuilder(s.substring(i,i+k));
                    sb.reverse();
                    ans.append(sb);
                }else{
                    ans.append(s.substring(i,i+k));
                }
                rev=!rev;
            }
            i+=k;
        }
        return ans.toString();
    }
}