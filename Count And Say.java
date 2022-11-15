public class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String prev=countAndSay(n-1);
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<prev.length()){
            char c=prev.charAt(i);
            i++;
            int count=1;
            while(i<prev.length() && prev.charAt(i)==c){
                count++;
                i++;
            }
            ans.append(count);
            ans.append(c);
        }
       return ans.toString();    
    }
}
