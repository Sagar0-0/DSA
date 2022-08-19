class Solution {
public:
    bool isPossible(vector<int>& nums) {
        int n = nums.size();                
        unordered_map<int, int>m, m1;        
        // to store the frequency of each element
        for(int i=0;i<n;i++) m[nums[i]]++;       
        // iterate over nums
        for(auto it:nums){
            if(m[it] == 0) continue; // step 1. earlier explained
            m[it]--;// step 2. reduce the freq of element
            if(m1[it-1]>0){// step 3. earlier explained
                m1[it-1]--;
                m1[it]++;
            }else if(m[it+1] != 0 and m[it+2] != 0){ // step 4. --> if(next 2 consecutive elements present in the map) like if it == 1 then if 2 and 3 is present in the map or not if not then false else reduce their freq and store the last element's freq in second map
                m[it+1]--;
                m[it+2]--;
                m1[it+2]++;
            }
            // if for test case 1 2 3 3 4 4 5 5 answer is true but our algo return false when reached to 4 so to overcome it we are using m1 and doing step 3, like if for 4 if 3 is present in m1 then add 4 also to one of the subsequence.
            // https://youtu.be/Gmc-4Dpzw2g -- video for reference
            else{
                return false;
            }
        }
        return true;
    }
};
