class Solution {
public:
    int longestMountain(vector<int>& arr) {
        int ans = 0;
        for(int i =1;i<arr.size()-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                int x =i,y=i;
                while(x>0&&arr[x]>arr[x-1]){
                    x--;
                }
                while(y<arr.size()-1&&arr[y]>arr[y+1]){
                    y++;
                }
                ans = max(ans,y-x+1);
                i=y;
            }
        }
        return ans;
    }
};
