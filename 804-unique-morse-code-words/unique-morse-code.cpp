class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        
        vector<string> morse = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
        "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        unordered_set<string> s;
        
        for(int i = 0; i < words.size(); i++){
            string str = words[i];
            string morseCode = "";
            for(int j = 0; j < str.length(); j++){
                morseCode += morse[str[j] - 'a'];
            }
            s.insert(morseCode);
        }
        return s.size();
    }
};
