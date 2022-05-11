class Solution {
    int ans;
    char[] vow={'a','e','i','o','u'};
    
    public int countVowelStrings(int n) {
        ans=0;
        count(n,new StringBuilder());
        return ans;
    }
    public void count(int n,StringBuilder str){
        if(n==0){
            ans++;
            return;
        }
        for(int i=0;i<5;i++){
            if(str.length()==0){
                str.append(vow[i]);
                count(n-1,str);
                str.deleteCharAt(str.length()-1);
            }else if(vow[i]>=str.charAt(str.length()-1)){
                str.append(vow[i]);
                count(n-1,str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    
}