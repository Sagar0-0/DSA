class Solution{
public:
    int minLength(string s, int n) {
        // code here
        stack<char> S;
        char arr[10] = {'9','2','1','4','3','6','5','8','7','0'};
        
        for(char it : s)
        {
            if(!S.empty() and arr[S.top()-'0'] == it)
                S.pop();
            else
                S.push(it);
        }
        
        return S.size();
    } 
};
