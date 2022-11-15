class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }   
            stack.push(c);   
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
