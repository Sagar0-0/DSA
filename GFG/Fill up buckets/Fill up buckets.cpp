class Solution{
public:
    int totalWays(int n, vector<int>capacity) {
        // code here
        
        sort(capacity.begin(), capacity.end());

long long int a=1;

for(int i=0;i<n;i++){

    a=(a%1000000007)*(capacity[i]-i);

    a=a%(1000000000+7);

    

}

int b=a%1000000007;

return b;
    }
};
