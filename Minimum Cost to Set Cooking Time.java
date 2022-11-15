class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int tar) {
     
        int min=tar/60, sec=tar%60, minCost=moveCost*4+pushCost*4;
        if(min>99)
        {
            min--;
            sec+=60;
        }
        while(min>=0&&sec<=99)
        {
            tar=min*100+sec;
            char arr[]=(""+tar).toCharArray();
            int mul=0;
            for(int i=0;i<arr.length-1;i++)
                if(arr[i]==arr[i+1])
                    mul++;
            if(startAt==arr[0]-'0')
                minCost=Math.min(minCost,pushCost*arr.length+moveCost*(arr.length-1-mul));
            else
                minCost=Math.min(minCost,pushCost*arr.length+moveCost*(arr.length-mul));
            min--;
            sec+=60;
        }
        return minCost;
    }
}
