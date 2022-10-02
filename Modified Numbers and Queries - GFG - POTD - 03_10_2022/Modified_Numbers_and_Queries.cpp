// { Driver Code Starts 
// Initial Template for C++ 
#include <bits/stdc++.h>
using namespace std; 
// }
// User Function Template for C++. 

class solution {
    public:
        int sumOfAll(int l , int r)
        {
            // code here
            vector<int> sieve(r + 1) ; 
            vector<int> dp(r + 1) ; 
            dp[1] = 1 ; 

            for(int i = 2 ; i <= r ; i++)
            {
                if(sieve[i] == 0)
                {
                    for(int j = i ; j <= r ; j += 1)
                    {
                        sieve[j] = 1 ; 
                        dp[j] += i ; 

                    }
                }
            }
            return accumulate(dp.begin() + l , dp.end() , 0) ; 

        }
}; 


// { Driver Code Starts 
int main()
{
    int t ; 
    cin >> t ; 
    while(t--)
    {
        int l , r ; 
        cin >> l >> r ; 
        solution ob ; 
        cout << ob.sumOfAll(l, r) << endl ; 
    }
    return 0 ;
}

// } Driver Code Ends