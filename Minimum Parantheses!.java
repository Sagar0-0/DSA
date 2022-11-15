public class Solution {
    public int solve(String A) {
        int ans=0;
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()>0){
                    st.pop();
                }else{
                    ans++;
                }
            }
        }
        ans+=st.size();
        return ans;
    }
}
