class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        Queue<Character> q=new LinkedList<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                q.add(ch);
                set.add(ch);
            }else{
                while(q.peek()!=ch){
                    char ele=q.remove();
                    set.remove(ele);
                }
                q.remove();
                q.add(ch);
            }
            ans=Math.max(ans,q.size());
        }
        return ans;
    }
}