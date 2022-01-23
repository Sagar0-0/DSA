public class Solution {
    public int[] plusOne(int[] a) {
        //if all elements are 9 than increase size
        if(allNines(a)){
            int[]ans=new int[a.length+1];
            ans[0]=1;
            return ans;
        }else{
            // add 1 to specified position
            for(int i=a.length-1;i>=0;i--){
                if(a[i]+1<10){
                    a[i]=a[i]+1;
                    break;
                }else{
                    a[i]=0;
                }
            }
            //check if there are preceding zeroes if yes then store index of first nonzero digit index
            int start=0;
            for(int i=0;i<a.length;i++){
                if(a[i]!=0){
                    start=i;
                    break;
                }
            }
            // new array of size= size-no. of preceding zeroes
            int[]ans=new int[a.length-start];
            for(int i=0;i<ans.length;i++){
                ans[i]=a[start+i];
            }
            return ans;
        }
    }
    //helper fxn to check if there are all zeroes
    public boolean allNines(int[]a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=9){
                return false;
            }
        }
        return true;
    }
}
