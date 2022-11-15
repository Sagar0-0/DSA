public class Solution {
    public int jump(int[] a) {
        if(a.length<=1) return 0;
        int farthest=0,current=0,jumps=0;
        for(int i=0;i<a.length;i++)
        {
            farthest=Math.max(farthest,i+a[i]);
            if(i==current)
            {
                current=farthest;
                if(i!=a.length-1)
                    jumps++;
            }
            if(i>current) return -1;
        }
        return jumps;
    }
}
