class Solution {
    public int maxProfit(int[] a) {
        int profit=0,i;
        for(i=0;i<a.length-1;i++)
        {
//            currentmax=a[i];
//            if(a[i+1]<currentmax) {
//                profit = profit + currentmax - currentmin;
//                currentmin = a[i + 1];
//            }
            if(a[i+1] - a[i] > 0)
                profit=profit+ a[i+1] - a[i];
        }
        return profit;
    }
}
