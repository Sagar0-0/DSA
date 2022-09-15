class Solution {
public:
    vector<int> findOriginalArray(vector<int>& changed) {
//         hashmap approach
//         if the len of i/p is odd return {}, because double array must have even len
        
            if(changed.size() & 1) return {};
//         count the freq of each number
        unordered_map<int, int>mp;
        for(auto x : changed) mp[x]++;
        vector<int> res;
//         sort in asc
        sort(changed.begin(), changed.end());
//         keep the unique elements only in changed 
        changed.erase(unique(changed.begin(), changed.end()), changed.end());
//         so that we can iterate from smallest to largest
        for(auto x : changed){
//             if the numb of x is greater than mp[x*2], there'd be some mp[x] left therefore return {} here as a changed isn't a double array
            if(mp[x] >mp[x*2]) return {};
            for(int i =0; i<mp[x]; i++){
//                 otherwise we put the ele `x` mp[x] to res
                res.push_back(x);
//                 at same time we decrease the count of mp[x*2] by 1
//                 we don't need to decrease m[x] by 1 as we won't use it again
                mp[x*2] -= 1;
                
                
            }
            
        }
        return res;
    }
};