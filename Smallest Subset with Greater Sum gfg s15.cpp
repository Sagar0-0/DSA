#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
    int minSubset(vector<int> &Arr,int N){
        sort(Arr.begin(), Arr.end());
    long long sum =0;
    for(int i =0; i<N; i++) sum+=Arr[i];
    long long s =0;
    for(int i =N-1; i>=1; i--){
        s+=Arr[i];
        sum-=Arr[i];
        
        if(s >sum) return N-i;
        
    }
    return 1;
    }
};
int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        vector<int> Arr(N);
        for(int i=0;i<N;i++){
            cin>>Arr[i];
        }
        Solution ob;
        cout<<ob.minSubset(Arr,N)<<endl;
    }
    return 0;
}