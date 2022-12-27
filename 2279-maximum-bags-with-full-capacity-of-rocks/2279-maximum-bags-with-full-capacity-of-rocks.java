class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int x) {
        int n=rocks.length;
        int[]diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        int i=0;
        while(x>0){
            if(i<n && x>=diff[i]){
                x-=diff[i];
                i++;    
            }else{
                break;
            }
        }
        return i;
    }
}