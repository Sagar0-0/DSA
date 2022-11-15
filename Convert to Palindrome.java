public class Solution {
    public int solve(String A) {
        int n=A.length();
        int lo=0,hi=n-1,flag=0;
        while(lo<hi){
            if(A.charAt(lo)!=A.charAt(hi)){
                if(flag!=0)return 0;
                flag++;
                if(A.charAt(lo+1)==A.charAt(hi)){
                    lo++;
                }else if(A.charAt(hi-1)==A.charAt(lo)){
                    hi--;
                }else{
                    return 0;
                }
            }
            lo++;
            hi--;
        }
        return 1;
    }
}
