public class Solution {
    public String longestCommonPrefix(ArrayList<String> a) {
        String ans=a.get(0);
        int index=0;
        String s="";
        for(int i=1;i<a.size();i++){
            s=a.get(i);
            index=0;
            while(index<ans.length() && index<s.length()){
                if(ans.charAt(index)!=s.charAt(index)){
                    break;
                }
                index++;
            }
            ans=ans.substring(0,index);
        }
        return ans;
    }
}
