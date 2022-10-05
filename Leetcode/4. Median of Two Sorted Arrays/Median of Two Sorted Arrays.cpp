class Solution {
public:
    double findMedianSortedArrays(vector<int>& v1, vector<int>& v2) {
        for(int i =0;i<v2.size();i++){
            v1.push_back(v2[i]);
        }
        sort(v1.begin(),v1.end());
        double ans=0;
        if(v1.size()%2==0){
            int x = v1[v1.size()/2];
            int y = v1[v1.size()/2 -1];
            ans = (x+y)/(double)2;
        }
        else{
            ans = v1[v1.size()/2];
        }
        return ans;
    }
};
