#include <bits/stdc++.h>
using namespace std;

class Solution {
    private:void Sieve(vector<int> &Primes, int n){
        Primes[1]=1;
        for(int i =2; i<=n; i++)
            if(Primes[i] ==0)
                for(int j =i; j<=n; j+=i)
                    Primes[j]+=i;
    };
  public:
    int sumOfAll(int l, int r){
        // code here
        vector<int>Primes(r+1, 0);
        Sieve(Primes, r);
        int sum=0;
        for(int i =l; i<=r; i++)
        sum+=Primes[i];
        return sum;
    }
};
int main() {
    int t;
    cin >> t;
    while (t--) {
        int l, r;
        cin>>l>>r;
        Solution ob;
        cout<<ob.sumOfAll(l,r)<<endl;
    }
    return 0;
}

