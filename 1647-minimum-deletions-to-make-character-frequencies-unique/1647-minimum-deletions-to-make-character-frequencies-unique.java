class Solution {
    public int minDeletions(String s) {
        Set<Integer> set = new HashSet<>();
        int[] alpha = new int[26];
        char[] arr =s.toCharArray();
        for(char c:arr)
        {
            alpha[c-'a']++;
        }
        int count = 0;
        for(int i=0;i<26;i++) {
            if(alpha[i] != 0) {
                while(set.contains(alpha[i]) && alpha[i]>0) {
                    alpha[i]--;
                    count++;
                }
                set.add(alpha[i]);
            } 
        }
        
        return count;
    }
}