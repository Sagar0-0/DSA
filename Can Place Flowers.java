class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length==1 && flowerbed[0]==0)
            return true;
        if(flowerbed[0]==0 && flowerbed[1]==0 && n>0){
            n--;
            flowerbed[0]=1;
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0 && n>0){     
            n--;
            flowerbed[flowerbed.length-1]=1;
        }
        
        for(int i=1;i<flowerbed.length-1 && n>0;i++){
            //condition when we need to ignore 
            if(flowerbed[i-1] == 1 || flowerbed[i+1]==1 || flowerbed[i]==1)
                continue;
  
            flowerbed[i]=1;
            n--;
            if(n==0) return true;
        }
        
        return n==0;
    }
}
