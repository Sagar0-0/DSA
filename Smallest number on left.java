class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        List<Integer> ans=new ArrayList<>();
        ans.add(-1);
        Stack<Integer> s=new Stack<>();
        s.push(a[0]);
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(s.peek());
            }
            s.push(a[i]);
        }
        return ans;
    }
}


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
