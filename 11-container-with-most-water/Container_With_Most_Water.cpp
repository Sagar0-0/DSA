class Solution {
public:
    int maxArea(vector<int>& h) {
        int maxi = 0;
        int i=0,j=h.size()-1;
        while(i<j){
            maxi = max((min(h[i],h[j])*(j-i)),maxi);
            if(h[i]<h[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxi;
    }
};
