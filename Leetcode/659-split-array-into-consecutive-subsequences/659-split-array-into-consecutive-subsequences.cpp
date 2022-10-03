class Solution {
    typedef long long ll;

public:
   bool isPossible(vector<int> &nums)
{

    map<int, int> mp, mp2;
    for (ll i = 0; i < nums.size(); i++)
    {
        mp[nums[i]] = mp[nums[i]] + 1;
    }

    for (ll i = 0; i < nums.size(); i++)
    {
        // cout << nums[i] << " ";
        if (mp2[nums[i]] && mp[nums[i]])
        {
            mp[nums[i]] = mp[nums[i]] - 1;
            mp2[nums[i]] = mp2[nums[i]] - 1;
            mp2[nums[i] + 1] = mp2[nums[i] + 1] + 1;
        }
        else
        {
            if (mp[nums[i]])
            {
                mp[nums[i]] = mp[nums[i]] - 1;
                if (mp[nums[i] + 1])
                    mp[nums[i] + 1] = mp[nums[i] + 1] - 1;
                else
                    return false;
                if (mp[nums[i] + 2])
                    mp[nums[i] + 2] = mp[nums[i] + 2] - 1;
                else
                    return false;
                mp2[nums[i] + 3] = mp2[nums[i] + 3] + 1;
            }
        }
        // for (ll i = 0; i < nums.size(); i++)
        // {
        //     cout << mp[nums[i]] << " ";
        //     // if(mp[nums[i]])return false;
        // }
    }
    for (ll i = 0; i < nums.size(); i++)
    {
        // cout<<mp[nums[i]]<<" ";
        if (mp[nums[i]])
            return false;
    }
    return true;
}
};
