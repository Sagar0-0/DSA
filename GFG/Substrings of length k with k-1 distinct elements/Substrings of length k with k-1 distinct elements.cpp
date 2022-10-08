
class Solution {
  public:
    int countOfSubstrings(string s, int K) {
        // code here
        
        //window start i , end = j;
        int i=0, j=0, count=0;
        
        int n = s.length() ; 
        
        map<char,int> mp;
        
        while(j<n){
            
            mp[s[j]]++;
            
            
            if(j-i+1<K){
               j++;
            }
             else if (j-i+1 == K) {
                if (mp.size() == K-1){
                    count++;
                }
            
             mp[s[i]]--;
                if (mp[s[i]] == 0)
                    
                    mp.erase(s[i]);
                i++;
                j++;
            }   
        }
        return count;
        }
        
    
};
