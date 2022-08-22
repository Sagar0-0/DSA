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
