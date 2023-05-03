/*Code by rubb3rducky*/
#include <bits/stdc++.h>
//#include <boost/multiprecision/cpp_int.hpp>
#define lli long long
#define pb push_back
#define eb emplace_back
#define pi 3.14159265358979323846
#define MOD 1000000007
#define unbuffer cin.clear(); cin.sync();
#define foi(n)  for(lli i=0;i<n;i++)
#define foj(n)  for(lli j=0;j<n;j++)
#define test(T) lli T;cin>>T;while(T--)
#define loop(i, a, b) for(int i = (a); i<= (b); i++)
using namespace std;
//using namespace boost::multiprecision;
vector<int> sortByFreq(int arr[],int n)
   {
       vector<int>v;
       unordered_map<int , int>mp;
       priority_queue<pair<int , int>>maxh;
       foi(n)
           mp[arr[i]]++;
       for(auto it=mp.begin();it!=mp.end();it++)
           maxh.push({it->second,-1*(it->first)});
       while(!maxh.empty())
       {
           int fre=maxh.top().first;
           int ele=maxh.top().second;
           for(int i=1;i<=fre;i++)
              v.eb(-1*ele);
           maxh.pop();
       }
       return v;
   }

int main()
{
  ios_base::sync_with_stdio(false);
   cin.tie(NULL);
   cout.tie(NULL);
   test(T)
   {
     int n;
     cin>>n;
     int a[n];
     for(int i = 0 ; i<n ; i++)
     {
         cin>>a[i];
     }
      vector<int>v1 = sortByFreq(a , n);
      for(int i = 0 ; i<v1.size(); i++)
      {
          cout<<v1[i]<<" ";
      }
      cout<<endl;
   }
 }
