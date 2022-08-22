class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> s;
        
        sort(nums.begin(), nums.end());
        int n = nums.size();
        
        if(nums[0]==0 && nums[n-1]==0){
            return {{0,0,0}};
        }
        
        for(int i=0; i< n-2; i++){
            int l = i + 1, r = n - 1;
            
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if(sum == 0){ 
                    s.insert({nums[i], nums[l], nums[r]});
                    l++;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        
        vector<vector<int>> v;
        
        for(auto i = s.begin(); i!=s.end(); i++){
            v.push_back(*i);
        }
        
        return v;
    }
};


// Second Better Approach : 

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        for (unsigned int i=0; i<nums.size(); i++) {
            if ((i>0) && (nums[i]==nums[i-1]))
                continue;
            int l = i+1, r = nums.size()-1;
            while (l<r ) {
                int s = nums[i]+nums[l]+nums[r];
                if (s>0) r--;
                else if (s<0) l++;
                else {
                    res.push_back(vector<int> {nums[i], nums[l], nums[r]});
                    while (l < r && nums[l]==nums[l+1]) l++;
                    while (l < r  && nums[r]==nums[r-1]) r--;
                    l++; r--;
                }
            }
        }
        return res;
    }
};
