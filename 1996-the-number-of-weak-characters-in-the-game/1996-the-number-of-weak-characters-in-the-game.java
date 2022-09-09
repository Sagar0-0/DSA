class Solution {
    public int numberOfWeakCharacters(int[][] prop) {
        
        /** Solution
        1. here we sort the array in the increasing order of attack
         1.1 if two attack has a same value then we sort the decreasing order of defense
        
        2. compare the defense value and increasing answer count
         2.1 chnage the defense value if it is greater
        
        
        */
                                       //if attack same then  decreasing order of defense else increasing order of attack
        Arrays.sort(prop,(a,b)->  a[0]==b[0]? b[1]-a[1] : a[0]-b[0]);
        
        int min=Integer.MIN_VALUE;
        int ans=0;
        
        for(int i=prop.length-1;i>=0;i--){
            int[] arr=prop[i];
            int att=arr[0];
            int def=arr[1];
            
             if(def<min){
                ans++;
            }
            
            min=Math.max(def,min);
        }
        
        return ans;
        
    }
}