// binary search
class Solution{
  public:
    int binary(int v[], int key, int n){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(key >= v[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    vector<int> countEleLessThanOrEqual(int v1[], int v2[], int m, int n)
    {
        //Your code goes here
        vector<int> v;
        sort(v2, v2+n);
        for(int i=0;i<m;i++){
            int cnt = binary(v2, v1[i], n);
            v.push_back(cnt);
        }
        return v;
    }
};

// another way is to find the upper bound of each element of v1 in v2 after sorting v2.
