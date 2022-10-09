class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        //vector<int> ans(2,-1);
        int i=0,j=numbers.size()-1;
        while(i<j)
        {
            int sum=numbers[i]+numbers[j];
            if(sum>target)
            {
                j--;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                return {i+1,j+1};
            }
        }
        return {};
        
    }
};
