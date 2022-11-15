class Solution {
public:
    // Function to check whether the substring can be replaced with stamp
    bool canReplace(string &stamp, string &target, int i, int n)
    {        
        for(int p=0; p<n; p++)
            if(target[i+p] != '?' and target[i+p] != stamp[p])
                return false;
        
        return true;
    }
    
    // Function to replace all non '?' to '?' and return no. of changed value
    void replace(string &stamp, string &target, int i, int n, int &cnt)
    {        
        for(int p=0; p<n; p++)
            if(target[i+p] != '?')
                cnt++, target[i+p] = '?';
    }
    
    vector<int> movesToStamp(string stamp, string target) {
        
        int n = stamp.length(), m = target.length(), cnt = 0;
        
        vector<int> ans;
        vector<bool> visited(m,false);
        
        while(cnt < m)
        {
            bool f = false;
            
            for(int i=0; i<=m-n; i++)
                if(!visited[i] and canReplace(stamp, target, i, n))
                {
                    replace(stamp, target, i, n, cnt);
                    ans.push_back(i);
                    visited[i] = f = true;
                }
            
            if(!f)
                break;
        }
        
        if(cnt < m)
            return {};
        
        reverse(ans.begin(), ans.end());
        
        return ans;
    }
};
