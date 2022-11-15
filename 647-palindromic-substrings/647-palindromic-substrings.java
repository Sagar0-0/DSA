class Solution {
    public int countSubstrings(String s) {
        char[] cs = s.toCharArray();
        int res = 0;
        for(int i = 0;i<s.length(); i++){
            //odd cases
            for(int a = i, b = i; a >= 0 && b < s.length(); a --, b ++){
                if(cs[a] != cs[b])
                    break;
                res++;
            }
            //even cases
            for(int a = i, b = i + 1; a >= 0 && b < s.length(); a --, b ++){
                if(cs[a] != cs[b])
                    break;
                res ++;
            }
        }
        return res;
    }
}