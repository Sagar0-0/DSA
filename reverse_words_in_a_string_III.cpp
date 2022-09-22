class Solution {
public:
    string reverseWords(string s) {
        string result;
        int last=-1;
        for(int i=0;i<s.length();++i){
           if(s[i]==' '||(i==s.length()-1)){
               int rev=
                   (i==s.length()-1)?i:i-1;
               for(;rev>last;rev--){
                   result+=s[rev];
               }
               if(i!=s.length()-1){
                   result+=' ';
               }
               last=i;
           }
               
        }
        return result;
    }
};
