class Solution{
    static int xorCal(int k){
        // code here
        // if (k == 1)return 2;
        // int a = k >> 1;
        // int b = a ^ k;
        // return Math.abs(a - b) == 1? Math.min(a,b): -1;
        if (k % 2 == 0)
            return -1;
            
        if ((k & (k+1)) != 0)
            return -1;
            
        if (k == 1)
            return 2;
        
        return k>>1;
    }
}
