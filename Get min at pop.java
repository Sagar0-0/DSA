
class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prevMin=s.peek();
            int min=Math.min(prevMin,curr);
            s.push(min);
        }
        
        return s;
        
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
