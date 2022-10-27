class Solution{
public:
    int findMin(int n, char arr[]){
        // code here
        
          unordered_map<char,int>mp;
        for(int i = 0 ; i < n ; i++){
            mp[arr[i]]++;
        }
        int cnt = 0;
        for(auto x : mp){
            cnt+=x.second;
        }
       if(mp['R']%2==0 and mp['B']%2==0 and mp['G']%2==0){
           return 2;
       }
       else if(mp['R']%2==1 and mp['B']%2==1 and mp['G']%2==1){
           return 2;
       }
       else{
           return 1;
       }
    }
};
