class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<ops.length;i++){
            String s=ops[i];
            if(!s.equals("C") && !s.equals("D") && !s.equals("+")){
                st.push(Integer.parseInt(s));
            }else{
                if(s.equals("C")){
                    st.pop();
                }else if(s.equals("D")){
                    int ele=2*st.peek();
                    st.push(ele);
                }else{
                    int sec=st.pop();
                    int fis=st.pop();
                    int thir=fis+sec;
                    st.push(fis);
                    st.push(sec);
                    st.push(thir);
                }
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}