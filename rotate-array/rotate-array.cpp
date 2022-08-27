class Solution {
public:
    void rotate(vector<int>& nums, int k) {        
        // eg 1 2 3 4 5 6 7
        k %= nums.size();
        reverse(nums.begin(), nums.end()); // reverse full 7 6 5 4 3 2 1
        reverse(nums.begin(), nums.begin()+k); // reverse till first k 5 6 7 4 3 2 1
        reverse(nums.begin()+k, nums.end()); // reverse till end from k 5 6 7 1 2 3 4        
    }
};
