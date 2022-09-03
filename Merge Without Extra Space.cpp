// Merge Without Extra SpaceMerge Without Extra Space

class Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
            int l = n-1, r =0;
            while(l>=0 && r<m){
                if(arr2[r]<arr1[l]){
                    int tmp = arr2[r];
                    arr2[r] = arr1[l];
                    arr1[l] = tmp;
                    l--, r++;
                }else break;
            }
            sort(arr1, arr1+n);
            sort(arr2, arr2+m);
        } 
};
