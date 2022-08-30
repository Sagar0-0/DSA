class Solution {
public:
    vector<int> answerQueries(vector<int>& n, vector<int>& q) {
        vector<int> v;
        sort(n.begin(),n.end());
        for(int i =0;i<q.size();i++){
            int x = q[i];
            int sum =0;
            int count =0;
            for(int j = 0;j<n.size();j++){
                sum+=n[j];
                if(sum<=x){
                    count++;
                }
            }
            v.push_back(count);
        }
        return v;
    }
};
