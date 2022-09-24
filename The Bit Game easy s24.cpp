#include<bits/stdc++.h> 
using namespace std; 
class Solution{   
public:
    int swapBitGame(long long N){
        // code here 
        int win=0, swap=0;
        while(N>0){
            if((N&1)==1 && swap>0) win^=swap;
            if((N&1)==0) swap++;
            N>>=1;
        }
        return win>0? 1: 2;
    }
};

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        long long N;
        cin >> N;
        Solution ob;
        cout << ob.swapBitGame(N) << endl;
    }
    return 0; 
}