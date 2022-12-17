class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.length()>1 || Character.isDigit(s.charAt(0))){
                st.push(Integer.parseInt(s));
            }else{
                int a=st.pop();
                int b=st.pop();
                char ch=s.charAt(0);
                if(ch=='+'){
                    st.push(a+b);
                }else if(ch=='-'){
                    st.push(b-a);
                }else if(ch=='*'){
                    st.push(a*b);
                }else{
                    st.push(b/a);
                }
            }
        }
        return st.pop();
    }
}