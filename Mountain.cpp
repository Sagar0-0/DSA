//A sample program to find the largest mountain with largest width
#include<iostream>
#include<vector>
using namespace std;
int mountain(vector<int> &v,int n)
{
    int i=1,ans=0,c,j;
    while(i<n-1)
    {
        if(v[i]>v[i-1]&&v[i]>v[i+1])
        {
            c=1;
            j=i;
        while(j>=1&&v[j]>v[j-1])
        {
            j--;
            c++;
        }
        while(i<n-1&&v[i]>v[i+1])
        {
            c++;
            i++;
        }
        ans=max(ans,c);
        }
        else
        {
            i++;
        }
    }
    return ans;
}
int main()
{
    system("clear");
    vector<int> v;
    int n,i,c;
    cout<<"Enter how many number you want in the array\n";
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>c;
        v.push_back(c);
    }
    cout<<"The largest peak in the array is: "<<mountain(v,n)<<endl;
    return 0;
}
