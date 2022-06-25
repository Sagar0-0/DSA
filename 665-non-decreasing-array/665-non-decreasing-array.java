class Solution {
    public boolean checkPossibility(int[] a) {
        boolean found=false;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                if(found)return false;
                found=true;
                boolean done=false;
                if(i!=0){
                    if(a[i+1]>=a[i-1]){
                        a[i]=a[i+1];
                    }
                }else{
                    a[i]=a[i+1];
                    done=true;
                }
                if(!done){
                    if(i+1==a.length-1){
                        a[i+1]=a[i];
                    }else{
                        a[i+1]=a[i+2];
                    }
                    if(a[i]>a[i+1])return false;
                }
            }
        }
        return true;
    }
}