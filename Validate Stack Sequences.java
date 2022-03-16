class Solution {
    public boolean validateStackSequences(int[] a, int[] b) {
        Deque<Integer> st=new ArrayDeque<>();
        int i=0;
        int j=0;
        st.push(a[i]);
        i++;
        while(i<a.length || j<b.length){
            if(st.peek()!=null){
                while(st.peek()!=b[j] && i<a.length){
                    st.push(a[i]);
                    i++;
                }
                if(st.peek()==b[j]){
                    st.pop();
                    j++;
                }else{
                    return false;   
                }
            }else{
                st.push(a[i]);
                i++;
            }
        }
        return true;
    }
}
