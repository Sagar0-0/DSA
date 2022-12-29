
class Solution {
    public static int[] asteroidCollision(int N, int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int num:arr){
            if(num<0){
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(num)){
                    st.pop();
                }
                
                if(!st.isEmpty()){
                    if(st.peek()==Math.abs(num)){
                        st.pop();
                    }else if(st.peek()<0){
                        st.push(num);
                    }
                }else if(st.isEmpty()){
                    st.push(num);
                }
            }else{
                st.push(num);
            }
        }
        int[] ans =new int[st.size()];
        int i=st.size()-1;
        while(st.size()>0)ans[i--]=st.pop();
        return ans;
    }
}
