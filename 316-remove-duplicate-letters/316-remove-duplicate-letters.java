class Solution {
    public String removeDuplicateLetters(String s) {
        int[]freq=new int[26];
        int[]done=new int[26];
        for(char c:s.toCharArray()){
            freq[c-97]++;
        }
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(done[ch-97]==0){
                while(stack.size()>0 && stack.peek()>ch){
                    if(freq[stack.peek()-97]>0){
                        char out=stack.pop();
                        done[out-97]=0;
                    }else{
                        break;
                    }
                }
                done[ch-97]=1;
                stack.push(ch);
            }
            freq[ch-97]--;
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}