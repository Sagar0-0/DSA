class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        int[]dp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(i);
            }else if(c==')'){
                if(stack.isEmpty()){
                    dp[i]=1;
                }else{
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()){
            dp[stack.pop()]=1;  
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(dp[i]==0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}
