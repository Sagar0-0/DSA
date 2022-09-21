#include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    long long int numberOfSquares(long long int base)
    {
        //code here
        long long int x = base/2, res = x*x-x;
        return res/2;
    }
};
int main()
{
	int t;
	cin >> t;

	while (t--)
	{
		long long int base;
		cin >> base;

        Solution ob;
		cout << ob.numberOfSquares(base) << "\n";

	}

	return 0;
}