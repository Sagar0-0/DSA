class Solution {
    Stack<Integer> st=new Stack<Integer>();
    Stack<Integer> mst=new Stack<Integer>();
    public void push(int x) {
        if (st.empty() && mst.empty()){
            st.push(x);
            mst.push(x);
        }else{
            st.push(x);
            if(x<mst.peek()){
                mst.push(x);
            }else{
                mst.push(mst.peek());
            }
        }
    }
    public void pop() {
        if(!st.empty()){
            st.pop();
            mst.pop();
        }
    }
    public int top() {
        int k=-1;
        if(!st.empty()){
            k=st.peek();
        }
        return k;
    }
    public int getMin() {
        int k=-1;
        if(!mst.empty()){
            k=(mst.peek());
        }
        return k;
    }
}
