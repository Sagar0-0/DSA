class Solution {
    
    public String reverse(String S){
        //code here
        Deque<Character> s=new ArrayDeque<>();
        for(char c:S.toCharArray()){
            s.push(c);
        }
        S="";
        while(!s.isEmpty()){
            S+=s.pop()+"";
        }
        return S;
    }
}
