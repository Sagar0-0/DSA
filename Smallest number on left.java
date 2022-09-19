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
