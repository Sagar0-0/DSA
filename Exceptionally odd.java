
class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int ans=0;
        for(int i:arr)ans=ans^i;
        return ans;
    }
}
