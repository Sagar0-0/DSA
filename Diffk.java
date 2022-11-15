public class Solution {
    public int diffPossible(int[] a, int k) {
        int i=0;
        int j=1;
        while(i<j && j<a.length){
            if(a[j]-a[i]==k)return 1;
            else if(a[j]-a[i]<k){
                j++;
            }else if(a[j]-a[i]>k){
                if(i==j-1){
                    j++;
                }
                i++;
            }
        }
        return 0;
    }
}
