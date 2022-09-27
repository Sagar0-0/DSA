public class Solution {
    public int cntBits(ArrayList<Integer> A) {
    long total = 0, n = A.size();
   
    for (int j=0;j<32;j++) {
        long bitCount = 0;
        for (int i=0;i<n;i++)
            bitCount += (A.get(i) >> j) & 1;
        total += (bitCount % (1000000007) *(n - bitCount) % (1000000007)) % (1000000007) ;
    }
    total = (total*2) % (1000000007);
    return (int)total;
}
   
}
