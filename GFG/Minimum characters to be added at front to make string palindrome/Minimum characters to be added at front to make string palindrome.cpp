class Solution {
public:
    int minChar(string str){
        //Write your code here
        
        int i=0, j=str.length() - 1, last = j, ans = 0;
        
        while(i<j){
            
             //check for palindrome
             
             if(str[i] == str[j]){
                 
                 i++;
                 j--;
                 
             }
             
             //if characters dos not match decrease the value of last 
             //and put it into j , and increase value of ans'
             //start from 0
             
             else{
                 ans++;
                 i=0;
                 j= --last;
             }
            
            
        }
        
        //return ans
        
        return ans;
    }
};
