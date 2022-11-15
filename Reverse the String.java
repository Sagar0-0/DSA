public class Solution {
    public String solve(String s) {
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(sb.length()!=0){
                    ans+=sb.reverse()+" ";
                    sb.setLength(0);
                }
            }else{
                sb.append(s.charAt(i));
            }   
        }
        ans+=sb.reverse();
        return ans.trim();
    }
}
