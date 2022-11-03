class Solution{
public:
    int removals(vector<int> &arr, int k){
        sort(arr.begin(), arr.end());
        int last = 0, first = 0;
        for (int i = 0; i < arr.size(); i++){
            while (arr[i] - arr[first] > k)
                first++;
            last = max(last, i - first + 1);}
        return arr.size() - last; 
    }
};
