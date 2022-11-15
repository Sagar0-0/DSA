class Solution {
    static int countOfSubstrings(String s, int k) {
        // code here
        int ans=0;
        int[]freq=new int[26];
        for(int i=0;i<k;i++){
            freq[s.charAt(i)-'a']++;
        }
        int cnt=0;
        for(int x:freq){
            if(x>0)cnt++;
        }
        int i=0;
        int j=k;
        while(j<=s.length()){
            if(cnt==k-1){
                ans++;
            }
            if(j==s.length())break;
            freq[s.charAt(i)-'a']--;
            if(freq[s.charAt(i)-'a']==0)cnt--;
            freq[s.charAt(j)-'a']++;
            if(freq[s.charAt(j)-'a']==1)cnt++;
            i++;
            j++;
        }
        
        return ans;
    }
};
