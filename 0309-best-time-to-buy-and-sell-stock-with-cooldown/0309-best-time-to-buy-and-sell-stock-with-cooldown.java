class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String,Integer> hm = new HashMap<>();
        return maxProfit(0,prices,0,hm);
    }
     int maxProfit(int i, int [] prices, int buyOrsell,HashMap<String ,Integer> hm){
         if( i>=prices.length)
         return 0;
         String key = i+"anything" +buyOrsell;
         if(hm.containsKey(key))
         return hm.get(key);
         int x = 0;
         if(buyOrsell == 0){
             int buy = maxProfit(i+1, prices,1,hm)-prices[i];
             int notbuy = maxProfit(i+1,prices,0,hm);
             x=Math.max(buy, notbuy);
         }else{
             int sell = maxProfit(i+2,prices,0,hm)+prices[i];
             int notsell = maxProfit(i+1,prices,1,hm);
             x=Math.max(sell,notsell);
         }
          hm.put(key,x);
         return x;
         
     }
}