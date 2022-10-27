class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<N;i++){
            if(arr[i]<st.peek()){
                st.push(arr[i]);
            }else{
                int temp=st.peek();
                int removed=0;
                while(!st.isEmpty() && st.peek()<arr[i]){
                    st.pop();
                    removed++;
                }
                st.push(arr[i]);
                if(removed>=2){
                    ans.add(temp);
                }
            }
        }
        ans.add(st.peek());
        int[] res=new int[ans.size()];
        int idx=0;
        for(int i:ans){
            res[idx++]=i;
        }
        return res;
    }
}
