class Solution {
    public int minPartitions(String n) {
        int res = 0;
        for(int i=9; i>=1; i--) {
            
            String ch = String.valueOf(i);
            
            if( n.contains(ch) ) {
                res = i;
                break;
            }
                
        }
        
        return res;
        
    }
}