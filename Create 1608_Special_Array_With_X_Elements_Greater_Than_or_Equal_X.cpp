class Solution {
public:
    int specialArray(vector<int>& n) {
        int x = n.size();
        for(int i=1;i<=x;i++){
            int count = 0;
            for(int j = 0;j<n.size();j++){
                if(n[j]>=i){
                    count++;
                }
            }
            if(i==count){
               return i; 
            }
        }
        return -1;
    }
};
