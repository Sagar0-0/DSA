class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int a=tops[0];
        int b=bottoms[0];
        boolean hasA=true;
        for(int i=1;i<tops.length;i++){
            if(tops[i]!=a && bottoms[i]!=a){
                hasA=false;
                break;
            }
        }
        if(hasA==false){
            boolean hasB=true;
            for(int i=1;i<tops.length;i++){
                if(tops[i]!=b && bottoms[i]!=b){
                    hasB=false;
                    break;
                }
            }
            if(hasB==false){
                return -1;
            }else{
                //check min num for b
                int up=0;
                int down=0;
                for(int i=0;i<tops.length;i++){
                    if(tops[i]!=b){
                        up++;
                    }
                    if(bottoms[i]!=b){
                        down++;
                    }
                }
                return Math.min(up,down);
            }
        }else{
            //check min num for a
            int up=0;
            int down=0;
            for(int i=0;i<tops.length;i++){
                if(tops[i]!=a){
                    up++;
                }
                if(bottoms[i]!=a){
                    down++;
                }
            }
            return Math.min(up,down);
        }
    }
}