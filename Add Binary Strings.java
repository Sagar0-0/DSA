import java.math.BigInteger;
public class Solution {
    public String addBinary(String A, String B) {
        BigInteger a = new BigInteger(A, 2);
        BigInteger b = new BigInteger(B, 2);
        BigInteger c=a.add(b);
        return c.toString(2);
    }
}

==========================================================
    public class Solution {
    public String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;
        int carry = 0;
        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0) sum =sum+A.charAt(i)-'0';
            if(j>=0) sum += B.charAt(j)-'0';
            sb.append(sum%2);
            carry = sum/2;
            i--;j--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}
