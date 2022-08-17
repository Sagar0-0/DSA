/*
  Approach : 
       As we have to return the number of different transformations among all words we have, for that we need to find the total number
       of unique Strings that could be made through traversing, evey element of the array, we generate a morse Coded String by passing 
       to function getString(), then that returned string would be saved into a set, so as to allow oly unique strings to get save there
       , final size of this set will be reuired output.
  
*/

//  Code : 
class Solution {
public:
    vector<string> v = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
 string getString(string s){
     string tmp = "";
     for(int i=0; i<s.length(); i++){
         tmp+= v[s[i]-'a'];
     }
     return tmp;
 }   
    int uniqueMorseRepresentations(vector<string>& words) {
        
        unordered_set<string> st;
        
        for(int i=0; i<words.size(); i++){
            string tmp = getString(words[i]);
            st.insert(tmp);
        }
        
        return st.size();
    }
};

/*
  Time Complexity: O(n*l) l is length of largest string
  Space Complexity: O(n)
  
  Here n, is Size of vector words
*/
