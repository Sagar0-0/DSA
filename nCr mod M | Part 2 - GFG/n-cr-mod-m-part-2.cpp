// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution {
public:
vector<int> findPrimeFactors(int n){
       set<int> factors;
       vector<int> ans;
       int c=2;
       while(n>1){
           if(n%c==0){
               factors.insert(c);
               n/=c;
           }
           else
               c++;
       }
       for(auto i:factors){
           ans.push_back(i);
       }
       return ans;
   }
   int findByCrt(const vector<int> x, const vector<int> r){
       const int kN=x.size();
       int min_x=0;
       while(true){
           bool found=true;
           for(int i=0;i<kN;i++){
               if(min_x%x[i]!=r[i]){
                   found=false;
                   break;
               }
           }
           if(found){
               return min_x;
           }
           min_x++;
       }
   }
   int rCnModP(int n, int r, int p){
       if(r==0||r==n){
           return 1;
       }
       int nCr[r+1];
       memset(nCr, 0, sizeof(nCr));
       nCr[0]=1;
       for(int i=1;i<=n;i++){
           for(int j=min(i,r);j>0;j--){
               nCr[j]=(nCr[j]+nCr[j-1])%p;
           }
       }
       return nCr[r];
   }
   int rCnModPrimeLucas(int n, int r, int p){
       if(r==0) {
           return 1;
       }
       return (rCnModPrimeLucas(n/p, r/p, p)*rCnModP(n%p, r%p, p))%p;
   }
   
   
   int nCrModM(int n, int r, int m){
       const auto primes=findPrimeFactors(m);
       vector<int> rem;
       for(const int p:primes){
           rem.push_back(rCnModPrimeLucas(n, r, p));
       }
       return findByCrt(primes, rem);
}
};

// { Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, r, m;
		cin >> n >> r >> m;
		Solution obj;
		int ans = obj.nCrModM(n, r, m);
		cout << ans << "\n";
	}
	return 0;
}  // } Driver Code Ends