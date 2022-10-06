public int maxProfit(int[] prices) {
    //buy and sell stocks 1
    int lsf= Integer.MAX_VALUE;//least so far
    int op=0;//overall profit
    int pist=0;//profit if sold today
  
    for(int i=0;i<prices.length;i++){
        if(prices[i]<lsf){
            lsf=prices[i];
        }
        pist=prices[i]-lsf;
        if(pist>op){
op=pist; }
}
return op; }
