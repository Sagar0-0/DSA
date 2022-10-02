#include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    void sort012(int a[], int n)
    {
        // code here 
        int zero =0, one =0, two =n-1;
        while(one<=two){
            if(a[one]==0){
                swap(a[one] ,a[zero]); zero++, one++;
            }else if(a[one]==2){
                swap(a[one], a[two]); two--;
            }else one++;
        }
    }
    
};
int main() {

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }

        Solution ob;
        ob.sort012(a, n);

        for(int i=0;i<n;i++){
            cout << a[i]  << " ";
        }

        cout << endl;
        
        
    }
    return 0;
}