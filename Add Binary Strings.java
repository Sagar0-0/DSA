import java.math.BigInteger;
public class Solution {
    public String addBinary(String A, String B) {
        BigInteger a = new BigInteger(A, 2);
        BigInteger b = new BigInteger(B, 2);
        BigInteger c=a.add(b);
        return c.toString(2);
    }
}
