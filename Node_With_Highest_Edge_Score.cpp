class Solution {
public:
    int edgeScore(vector<int>& e) {
        int n = e.size();
        vector<long long > v(n);
        for(int i =0;i<n;i++){
            v[e[i]]+=i;
        }
        long long sum = INT_MIN;
        int index=-1;
        for(int i =0;i<v.size();i++){
            if(v[i]>sum){
                 sum = v[i];
                index = i;
            }
        }
        return index;
    }
};
