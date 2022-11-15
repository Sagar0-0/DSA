class Solution {
public:
    bool isPossible(vector<int>& nums) {

        unordered_map<int,int> available, required;

        for(int it : nums)
            available[it]++;

        for(int it : nums)
        {
            if(available[it] <= 0)
                continue;

            else if(required[it] > 0)
            {
                available[it]--;
                required[it]--;
                required[it+1]++;
            }

            else if(available[it] > 0 and available[it+1] > 0 and available[it+2] > 0)
            {
                available[it]--;
                available[it+1]--;
                available[it+2]--;
                required[it+3]++;
            }

            else
                return false;
        }

        return true;
    }
};
