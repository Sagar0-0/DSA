public class Solution {
    public int solve(String A) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()==0)
                    return 0;
                else
                    st.pop();
            }
        }
        if(st.size()>0)return 0;
        return 1;
    }
}
