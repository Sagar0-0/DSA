#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minimumSwaps(int c[],int v[],int n,int k,int b,int T)
    {
            // code here
            int count =0, swap =0; // initializing
            for(int i = n-1; i>=0; i--){
                if((b-c[i])/v[i]<= T){
                    swap+=((n-1)-(i+count)); count++;
                }
                if(count >=k) break;
            }
            if(count >=k) return swap;
            else return -1;
            // TC: O(N) , SC: O(1)
    }
};
int main(){
    int t=1,testcases=1;
    cin>>t;
    while(t>=testcases)
    {
        int n,k,b,T;
        cin>>n>>k>>b>>T;
        int c[n];
        int v[n];
        for(auto &j:c)
            cin>>j;
        for(auto &j:v)
            cin>>j;
        Solution s;
        int ans=s.minimumSwaps(c,v,n,k,b,T);
        cout<<ans<<endl;
        testcases++;
    }
    // TIME;
    return 0;
}