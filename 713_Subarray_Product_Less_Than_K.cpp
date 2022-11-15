class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& n, int k) {
        if(k<=1){
            return 0;
        }
        int product=1,j=0,sub=0;
        for(int i =0;i<n.size();i++){
            product *=n[i];
            while(product>=k){
                product=product/n[j++];
            }
            sub+=i-j+1;
        }
        return sub;
    }
};
