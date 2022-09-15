#include<bits/stdc++.h>
using namespace std;
#define ll long long
void solve(){
    int n;
    cin>>n;
    multiset<int>set;
    for(int i = 0; i<n; i++){
        int x;
        cin>>x;
        auto it = set.upper_bound(x);
        if(it == set.end()){
            set.insert(x);
        }
        else{
            set.erase(it);
            set.insert(x);
        }
    }
    cout<<set.size()<<endl;
    return;
}
int main()
{
    solve();
    return 0;
}
