class Solution{
public:
    /*You are required to complete this method*/
    int maxChainLen(struct val p[],int n){
        //Your code here
        vector<pair<int,int>>ans;
        for(int i=0;i<n;i++)
        {
            ans.push_back({p[i].second,p[i].first});
        }
        sort(ans.begin(),ans.end());
        int count=1;
        int x = ans[0].first;
        for(int i=0;i<n-1;i++)
        {
            if(ans[i+1].second>x)
            {
                x = ans[i+1].first;
                count++;
            }
        }
        return count;
    }
};
