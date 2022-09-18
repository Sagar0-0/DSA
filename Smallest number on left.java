class Solution{
    static List<Integer> leftSmaller(int n, int arr[])
    {
        Stack<Integer>stack=new Stack<Integer>();
        List<Integer>aa=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                aa.add(-1);
            }
            else{
                if(stack.peek()<arr[i]){
                    aa.add(stack.peek());
                }
                else{
                    while(!stack.isEmpty() && stack.peek()>=arr[i]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        aa.add(-1);
                    }
                    else{
                        aa.add(stack.peek());
                    }
                    
                }
               stack.push(arr[i]);
            }
        }
        return aa;
        
    }
}
