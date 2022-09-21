class Solution {
    public int reverse(int x) {
        int result = 0; 
        while ( x != 0){
            int d = x % 10 ;
            int next  = result * 10 + d;
        if((next - d)/10 != result){
            return 0;
        }
             result = next;
        x = x / 10 ;
        }
        
        
       
        return result;
        
        
        
    }
}
