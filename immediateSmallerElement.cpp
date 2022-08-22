// cpp 
class Solution {
public:
    void immediateSmaller(int *arr, int n) {
        //  code here
        for (int i = 0; i < n - 1; i++) {
            // if current position of arr greater than its next position, found greater update else not greater
            if (arr[i + 1] < arr[i]) arr[i] = arr[i + 1];
            else arr[i] = -1;
        }
        // for last element it always return -1 because there is no any number left to check
        arr[n - 1] = -1;
    }

};
