class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Pair> st = new Stack();
        int len = s.length();
        char c = ' ';
        int cur = 0;
        for(int i = 0; i < len; i++)
        {
            c = s.charAt(i);
            if(!st.empty())
            {
                Pair p = st.peek();
                if(c == p.letter)
                {
                    int j = p.count + 1;
                    st.pop();
                    st.push(new Pair(c, j));
                }
                else
                    st.push(new Pair(c, 1));
            }
            else
                st.push(new Pair(c, 1));
            
            if(st.peek().count == k)
                st.pop();
        }
        
        for(Pair p: st)
        {
            int i = p.count;
            while(i > 0)
            {
                sb.append(p.letter);
                i--;
            }
        }
        return sb.toString();
    }
    
    class Pair {
        char letter;
        int count;
        
        public Pair(char c, int count)
        {
            letter = c;
            this.count = count;
        }
    }
}