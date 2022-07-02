class Solution {
    public int maxArea(int h, int w, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int mod=1000000007;
        long hMax=0;
        for(int i=0;i<=a.length;i++){
            if(i==0){
                hMax=Math.max(hMax,a[i]);
            }else if(i==a.length){
                hMax=Math.max(hMax,h-a[i-1]);
            }else{
                hMax=Math.max(hMax,a[i]-a[i-1]);
            }
        }
        long vMax=0;
        for(int i=0;i<=b.length;i++){
            if(i==0){
                vMax=Math.max(vMax,b[i]);
            }else if(i==b.length){
                vMax=Math.max(vMax,w-b[i-1]);
            }else{
                vMax=Math.max(vMax,b[i]-b[i-1]);
            }
        }
        return (int)(hMax%mod * vMax%mod ) %mod;
    }
}