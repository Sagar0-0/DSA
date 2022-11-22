class Solution
{
    public int characterReplacement(String s, int k)
    {
        // code here
        int[]arr=new int[26];
        int prev=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            int curr=find(arr,k);
            if(curr==-1){
                arr[s.charAt(prev++)-'A']--;
            }else{
                ans=Math.max(ans,curr);
            }
        }
        return ans;
        
    }
    int find(int[]arr,int k){
        int same=0;
        int diff=0;
        for(int i:arr){
            if(i>same){
                diff+=same;
                same=i;
            }else{
                diff+=i;
            }
        }
        return diff<=k? same+diff : -1;
    }
}
