class Solution {
    public int myAtoi(String s) {
        int sign=1,flagSign=0,n=s.length();
        long ans=0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='-' && flagSign==0) {
                sign=-1;
                flagSign=1;
            }
            else if(s.charAt(i)=='+' && flagSign==0) {
                flagSign=1;
            }
            else if(s.charAt(i)==' ' && flagSign==0) {
                continue;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
                ans=ans*10+(s.charAt(i)-'0');
                if(ans*sign>=Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                else if(ans*sign<=Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                flagSign=1;
            }
            else break;
        }
        ans=ans*sign;
        return (int)ans;
    }
}
