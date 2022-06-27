class Solution {
    public int minPartitions(String n) {
        for(int i=9; i>=1; i--) {
            String ch = Integer.toString(i);
            if( n.contains(ch) )return i;
        }
        return 0;
        
    }
}