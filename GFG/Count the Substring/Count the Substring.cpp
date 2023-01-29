class Solution{
public:
  long long countSubstring(string s){
    // start writing from here
    long long ans=0;
    unordered_map<long long,long long> help; // start unodering     
    vector<long long> dp(s.size(),0); // define the vector size
    long long sum=-1;
    if(s[0]=='1'){
         dp[0]=1;
         ans=1;
         sum=1;
    }
    help[sum]=0;
    help[0]=-1;
    for(int i=1;i<s.size();i++){
        long long temp=0;
        if(s[i]=='0')
            sum-=1;
        else
            sum+=1;
        if(s[i]=='0'){
            if(help.find(sum)!=help.end()) {
                if(help[sum]!=-1){
                    temp+=dp[help[sum]];
                }
            }
        }
        else{
            if(help.find(sum)!=help.end()){
                if(help[sum]!=-1){
                    temp=dp[help[sum]]+i-help[sum]-1;
                }
                else{
                    temp=i-help[sum]-1;
                }
            }
            else{
                temp+=i+1;
            }
        }
        help[sum]=i;
        dp[i]=temp;
        ans+=temp;
    }
    return ans;
  }
};
