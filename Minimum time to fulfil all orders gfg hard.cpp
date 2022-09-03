#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
    int getDonuts(int rank, int time){
        int i =1, currSum =1, numDonuts =0;
        while((rank*currSum) <= time){
            numDonuts++; i++;
            currSum+=i;
        }
        return numDonuts;
    }
    bool isPossible(vector<int>&A, int time, int donuts){
        int currSum =0;
        for(int i=0;i<A.size(); i++)
        currSum+=getDonuts(A[i], time);
        return currSum >=donuts;
    }
    int findMinTime(int N, vector<int>&A, int L){
        //write your code here
        int start =0, maxi =0;
        for(int i =0; i<L; i++)
        maxi = max(maxi, A[i]);
        int end  = maxi*((1LL*N*(N+1))/2);
        // getting mid element binary search
        while(start <=end){
            int mid = (start+end)/2;
            if(isPossible(A,mid,N))
            end = mid-1;
            else start = mid+1;
        }
        return start;
    }
    // TC:O(n*Log(n)) SC:O(1)
};