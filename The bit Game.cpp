class Solution{
public:
    int swapBitGame(long long N){
     int cnt=0;
     while(N>0){
         if((N&1)==1){
             cnt++;
         }
         N>>=1;
     }
     return cnt%2==0?2:1;
     }
};
