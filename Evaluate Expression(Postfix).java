public class Solution {
    public int evalRPN(String[] A) {
        Deque<Integer> stack=new ArrayDeque<>();
        int i=0;
        while(i<A.length){
            if(A[i].equals("+") || A[i].equals("/")|| A[i].equals("-")|| A[i].equals("*")){
                int first=stack.pop();
                int second=stack.pop();
                if(A[i].equals("+")){
                    stack.push(first+second);
                }else if( A[i].equals("/")){
                    stack.push(second/first);
                }else if( A[i].equals("-")){
                    stack.push(second-first);
                }else{
                    stack.push(second*first);
                }
            }else{
                stack.push(Integer.parseInt(A[i]));
            }
            i++;
        }
        return stack.pop();
    }
}
