class Solution
{
    
    void insertAtBottom(stack<int> &s,int &x)
    {
        if(s.empty())
        {
            s.push(x);
            return;
        }
        
        int num = s.top();
        s.pop();
        
        insertAtBottom(s,x);
        s.push(num);
    }
    
    void solve(stack<int> &st)
    {
        if(st.empty())  return;
        
        int x = st.top();
        st.pop();
        
        solve(st);
        
        insertAtBottom(st,x);
    }

    public:
    stack<int> Reverse(stack<int> st)
    {
        solve(st);
        return st;
    }
};
