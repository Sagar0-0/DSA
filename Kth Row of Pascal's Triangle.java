public class Solution {
    public int[] getRow(int a) {
        int[] res = new int[a+1];
	    res[0]=1;
	    res[a]=1;
        for(int i=1; i<a; i++){
	        int num = (a+1-i)*res[i-1]/i;
	        res[i]=num;
	    }
	    return res;
    }
}
