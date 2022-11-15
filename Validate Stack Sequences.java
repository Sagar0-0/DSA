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
//=============================================
class Solution {
    public boolean validateStackSequences(int[] arr, int[] pop) {
       
        int n=arr.length;
         if(n==0)
            return true;
        int j=0;
        int i=-1;
        for(int e:arr)
        {
                arr[++i]=e;
                while(i>=0&&arr[i]==pop[j])
                {
                    i--;
                    j++;
                }
        }
        if(i==-1&&j==n)
            return true;
        return false;
            
    }
}
