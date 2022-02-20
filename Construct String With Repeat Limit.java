class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int [] arr = new int [26];
        
        for (char c : s.toCharArray()){
            arr[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        int r;
        int nxt = 25;
        
        for (int i = 25, j = 25; i >= 0; --i){
            r = repeatLimit;
            
            while (arr[i] > 0 && r > 0 ){
                --r;
                --arr[i];
                sb.append((char)('a' + i));
            }
            
            if (arr[i] > 0){
                while(nxt >= i || (nxt >= 0 && arr[nxt] == 0) )
                    --nxt;
                
                if (nxt < 0) break;
                --arr[nxt];
                sb.append((char)('a' + nxt));
                ++i;
            }
            
            
        }
        
        return sb.toString();
    }
}
