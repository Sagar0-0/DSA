#include<bits/stdc++.h>
using namespace std;
class Solution
{
   public:
    string ReFormatString(string S, int K){
    	int n = S.size()-1,size =0;
    	string res="", temp="";
    	
    	while(n>=0){
    	    while(size<K && n>=0){
    	        if(S[n]!='-'){
    	           // to check alphabets
    	           int check = isalpha(S[n]);
    	           if(check){
    	               S[n] = toupper(S[n]);
    	           }
    	           temp+=S[n];
    	           size++;
    	        }
    	        n--;
    	    }
    	    size=0;
    	    res+=temp;
    	    temp.clear();
    	    if(n>=0) res+='-';
    	}
    	reverse(res.begin(), res.end());
    	if(res[0]=='-') return res.substr(1);
    	return res;
    	
    }
};

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    string S;
	    cin>>S;
	    int K;
	    cin >> K;
	    Solution ob;  
	    string ans=ob.ReFormatString(S, K);
	    cout<<ans;
	    cout<<"\n";
	}
	return 0;
}