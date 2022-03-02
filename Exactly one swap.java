class Solution 
{ 
    long countStrings(String s)
    { 
        // code here
        int n=s.length();
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        long ans=0;
        for(char c:s.toCharArray()){
            ans+=n-freq[c-'a'];
        }
        ans/=2;
        for(int i=0;i<26;i++){
            if(freq[i]>=2){
                ans++;
                break;
            }
        }
        return ans;
    }
}
