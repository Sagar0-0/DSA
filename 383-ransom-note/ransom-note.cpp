class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        
        vector<int> magazineHash(26,0); // 26 char, start from 0 , 
//         traverse magazing and keep count of each letter in magazineHash
        for(int i =0; magazine[i]!='\0'; ++i){
            magazineHash[magazine[i]-'a'] +=1;
            
        }
//         now traverse ransomNote and keep decrementing count in magazineHash
        for(int i =0;  ransomNote[i]!='\0'; ++i){
            if(magazineHash[ransomNote[i]-'a'] == 0) return false;
            magazineHash[ransomNote[i]-'a'] -=1; // using up char to lead decrement it by value 1 
            
        }
        return true;
//         TC:O(N+M) -> where n is the length of the magazing and M is length of randomString
        
    }
};