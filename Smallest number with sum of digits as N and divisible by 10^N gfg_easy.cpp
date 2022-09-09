#include<bits/stdc++.h>
using namespace std;
class Solution{
	public:
	string digitsNum(int N)
	{
        //  Approach
	   // subtract 9 with n, until n-9 is greater than 0 while loop
	   //for every return of 9, we add them in to a string
	   //after completion of while 
	   //finally, add curr N value to string

	   //Solution creating a string which has N sizes filled with zero's
	   string sumN_store, str(N, '0');
	   //loop calc number whose sum is N
	   while(N-9>0){
	       sumN_store+=to_string(9); // converting to string
	       N-=9; // N subtracting with 9, updating value of N
	   }
	   //this inserts final N value to string, so that it's sum will be 10
	   sumN_store+=to_string(N);
	   //adding to prev string
	   str+=sumN_store;
	   //to return mini number, reversing it to get sum N and should be divisible by 10^N
	   reverse(str.begin(), str.end());
	   return str;
	   //TC: O(N)
	}
};
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		string ans = ob.digitsNum(n);
		cout << ans <<"\n";
	}
	return 0;
}