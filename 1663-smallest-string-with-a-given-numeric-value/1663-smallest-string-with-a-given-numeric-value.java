class Solution {
    public String getSmallestString(int n, int k) {
        char ch[]=new char[n];
        int i=0;
        while(i<n){
            if(26*(n-i)>=k){
                ch[i]='a';
                i++;
                k--;
            }else{
                break;
            }
        }
        i--;
        ch[i]=(char)(k%26+'a');
        i++;
        while(i<n)
        {
            ch[i]='z';
            i++;
        }
        return String.valueOf(ch);
    }
}