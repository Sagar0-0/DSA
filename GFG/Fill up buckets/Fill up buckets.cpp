
    }
};


//2nd Solution

class Solution{
public:
int totalWays(int n, vector<int>capacity) {
        long mod=1e9+7;
       sort(capacity.begin(),capacity.end());
       
       long  ans=1;
       
       for(int i=0;i<n;i++)
           ans=(ans*(capacity[i]-i))%mod;
           
        return ans;
           
       
    }
};
