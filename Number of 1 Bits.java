public class Solution {
	public int numSetBits(long a) {
        int ans=0;
        while(a!=0){
            ans+=(a&1);
            a=a>>1;
        }
        return ans;
	}
}
