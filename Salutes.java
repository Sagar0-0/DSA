public class Solution {
    public Long countSalutes(String A) {
        Long ans=0l;
        Long left=0l;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='<')left++;
        }
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='>'){
                ans+=left;
            }else{
                left--;
            }
        }
        return ans;
    }
}
