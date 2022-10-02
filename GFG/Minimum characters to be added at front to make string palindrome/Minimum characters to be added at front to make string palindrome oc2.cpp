#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int minChar(string str){
        //Write your code here
        int i =0, j = str.length()-1;
        int temp_j =j, res =0;       
        while(i <=j){
            // to check curr with reverse, if matches incr
            if(str[i]== str[j]){
                i++; j--;
            }else{
                // otherwise
                res++;
                i=0;
                j=--temp_j;
            }
        }
        return res;
    }
};
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    string str;
	    cin >> str;
	    Solution ob;
	    int ans = ob.minChar(str);
	    cout << ans<<endl;
	}
	return 0;
}