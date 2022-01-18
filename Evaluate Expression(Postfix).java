public class Solution {
    public int evalRPN(String[] A) {
        Deque<String> stack=new ArrayDeque<>();
        int i=0;
        while(i<A.length){
            if(A[i].equals("+") || A[i].equals("/")|| A[i].equals("-")|| A[i].equals("*")){
                int first=Integer.parseInt(stack.pop());
                int second=Integer.parseInt(stack.pop());
                if(A[i].equals("+")){
                    stack.push(Integer.toString(first+second));
                }else if( A[i].equals("/")){
                    stack.push(Integer.toString(second/first));
                }else if( A[i].equals("-")){
                    stack.push(Integer.toString(second-first));
                }else{
                    stack.push(Integer.toString(first*second));
                }
            }else{
                stack.push(A[i]);
            }
            i++;
        }
        return Integer.parseInt(stack.pop());
    }
}
