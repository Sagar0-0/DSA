import java.math.BigInteger;
public class Solution {
    public int solve(String A, String B) {
        int n=A.length();
        if(A.charAt(n-1)=='1'){
            return 1;
        }else if(A.charAt(n-1)=='0'){
            return 0;
        }else if(A.charAt(n-1)=='5'){
            return 5;
        }else if(A.charAt(n-1)=='6'){
            return 6;
        }else if(A.charAt(n-1)=='2'){
            int pattern[]=new int[]{2,4,8,6};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(4);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[3];
            return pattern[x-1];
        }else if(A.charAt(n-1)=='3'){
            int pattern[]=new int[]{3,9,7,1};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(4);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[3];
            return pattern[x-1];
        }else if(A.charAt(n-1)=='4'){
            int pattern[]=new int[]{4,6};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(2);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[1];
            return pattern[x-1];
        }else if(A.charAt(n-1)=='7'){
            int pattern[]=new int[]{7,9,3,1};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(4);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[3];
            return pattern[x-1];
        }else if(A.charAt(n-1)=='8'){
            int pattern[]=new int[]{8,4,2,6};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(4);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[3];
            return pattern[x-1];
        }else if(A.charAt(n-1)=='9'){
            int pattern[]=new int[]{9,1};
            BigInteger in=new BigInteger(B);
            BigInteger sz=BigInteger.valueOf(2);
            int x=in.mod(sz).intValue();
            if(x==0)return pattern[1];
            return pattern[0];
        }
        return 1;
    }
}
