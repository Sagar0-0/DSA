public class Solution {
    int mod=1000000007;
    public int solve(String A) {
        int ans=0;
        int con=0;
        int vow=0;
        for(int i=A.length()-1;i>=0;i--){
            char c=A.charAt(i);
            if(vowel(c)){
                vow++;
                ans+=con;
            }else{
                con++;
                ans+=vow;
            }
            ans%=mod;
        }
        return ans;
    }
    public boolean vowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}
