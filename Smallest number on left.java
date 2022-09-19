class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<a.length;i++) {
            if(st.isEmpty()) {
                res.add(-1);
            }
            else {
                while(!st.isEmpty() && st.peek()>=a[i]) {
                    st.pop();
                }
                
                if(st.isEmpty()) {
                    res.add(-1);
                }
                else {
                    res.add(st.peek());
                }
            }
            st.push(a[i]);
        }
        return res;
    }
}
