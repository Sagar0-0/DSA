class Solution{
    public:
    int removals(vector<int>& arr, int k){
        sort(arr.begin(), arr.end());
        
        int l = 0, r = 0, len = 0;
        
        while(r<arr.size()){
            if(arr[r]-arr[l]<=k){
                r++;
                len = max(len, r-l);
            }else l++;
        }
        
        return arr.size()-len;
    }
};
