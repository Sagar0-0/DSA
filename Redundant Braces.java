public class Solution {
    public int braces(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }else{
                int count=0;
                while(stack.size()>0){
                    char ch=stack.pop();
                    if(ch=='(')break;
                    if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                        count++;
                    }
                }
                if(count==0)return 1;
            }
        }
        return 0;
    }
}
