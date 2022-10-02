#include<bits/stdc++.h> 
using namespace std; 
class Solution{   
public:
    bool isPowerof2(int num){
        if(ceil(log2(num))==log2(num)) return true;
        return false;
    }
    long long numberOfSubsequences(int N, long long A[]){
        // code here 
        int cnt =0;
        for(int i=0; i<N; i++){
            if(isPowerof2(A[i])) cnt++;
        }
        int mod=1e9+7;
        int res =1;
        for(int i =0; i<cnt;i++) res=(res*2)%mod;
        return res-1;
    }
};
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        long long A[N];
        for(int i=0;i<N;++i){
            cin >> A[i];
        }
        Solution ob;
        cout << ob.numberOfSubsequences(N,A) << endl;
    }
    return 0; 
} 