class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int speed=1;
        while(speed<max(piles)){
            int total=0;
            speed=(low+high)/2;
            for(int i:piles){
                total+= Math.ceil((double) i / speed);
            }
            if(total<=h){
                high=speed;
            }else{
                low=speed+1;
            }
            if(low==high)return low;
        }
        return speed;
    }
    public int max(int[]a){
        Arrays.sort(a);
        return a[a.length-1];
    }
}
