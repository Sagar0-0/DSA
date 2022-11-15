class Solution {
public:
    bool canConstruct(string rn, string mag) {
        if(mag.size() < rn.size()) return false;
        
         // 1.
//         unordered_map<char, int> m1, m2;
//         for(int i=0;i<rn.size();i++){
//             m1[rn[i]]++;
//         }
//         for(int i=0;i<mag.size();i++){
//             m2[mag[i]]++;
//         }
        
//         for(int i=0;i<rn.size();i++){
//             if(m1[rn[i]] > m2[rn[i]]){
//                 return false;
//             }
//         }
        
        
        // 2.
        vector<int> arr(26, 0);
        for(int i=0;i<mag.size();i++){
            arr[mag[i] - 'a']++;
        }
        for(int i=0;i<rn.size();i++){
            if(arr[rn[i] - 'a'] == 0) return false;
            else arr[rn[i] - 'a']--;
        }
        return true;
    }
};
