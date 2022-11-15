class Solution {
public:
    
    static bool comp(vector<int> &a,vector<int> &b){
        if(a[0]!=b[0])
            return a[0]>b[0];
        return a[1]<b[1];
    }
    
    int numberOfWeakCharacters(vector<vector<int>>& p) {
       sort(p.begin(),p.end(),comp);
        int max = INT_MIN;
        int ans=0;
        for(auto it:p){
            if(max>it[1]){
                ans++;
            }
            else{
                max = it[1];
            }
        }
        return ans;
    }
};


///===============Approch 1=========================


// int n = properties.size();
//         int weakp=0;
//         for(int i =0;i<n-1;i++){
//             for(int j =0;j<properties[0].size()-1;j++){
//                 if(properties[i][j]<properties[i+1][j+1]){
//                     weakp++;
//                 }    
//             }
//         }
//         return weakp;




//==================Approch 2======================
 // vector<pair<int,int>> v;
 //        int n = properties.size();
 //        for(int i =0;i<n;i++){
 //            v.push_back({properties[i][0],properties[i][1]});
 //        }
 //        sort(v.begin(),v.end());
 //        int ans=0;
 //        vector<int> m(v.size(),0);
 //        int i =0;
 //        for(auto it:v){
 //            int x = it.first;
 //            int y = it.second;
 //            for(auto it1:v){
 //                if(x<it1.first&&y<it1.second&&m[i]==0){
 //                    m[i]=1;
 //                    ans++;
 //                }
 //            }
 //            i++;
 //        }
 //        return ans;
