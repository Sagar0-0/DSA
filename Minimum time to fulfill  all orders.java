class Solution {
    public static int donutCount(int min,int rank[])
    {
        int dCount = 0;
        for(int i = 0;i < rank.length;i++)
        {
            int chefRank = rank[i];
            if(chefRank > min) continue;
            int curDount = 1;
            int curTime = chefRank;
            
            while(curTime <= min)
            {
                dCount++;
                curDount++;
                curTime += curDount*chefRank;
            }
        }
        return dCount;
    }
    public static int findMinTime(int n, int arrLength, int[] arr) {
        int l = 1, h = 10000000;
        while(l <= h)
        {
            int mid = (l+h)/2;
            int midRes = donutCount(mid,arr);
            if(n <= midRes) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
}
