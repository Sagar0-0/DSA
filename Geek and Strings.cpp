class Solution{
public:
    vector<int> prefixCount(int N, int Q, string li[], string query[])
    {
        vector<int>ans(Q,0);
        unordered_map<string,int>mp;
        
        for(int i=0;i<N;i++){
            string str="";
            for(int j=0;j<li[i].size();j++){
                str+=li[i][j];
                mp[str]++;
            }
        }
        
        
        for(int i=0;i<Q;i++){
            int temp=mp[query[i]];
            ans[i]=temp;
        }
        return ans;
    }
};
