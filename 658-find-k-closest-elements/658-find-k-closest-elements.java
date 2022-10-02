class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        int idx=binSea(arr,x);
        int l=idx;
        int h=idx;
        while(k>0){
            if(l==h){
                ans.add(arr[l]);
                k--;
                l--;
                h++;
            }else{
                int lefty=l<0?Integer.MAX_VALUE:Math.abs(x-arr[l]);
                int righty=h<arr.length?Math.abs(x-arr[h]):Integer.MAX_VALUE;
                if(lefty>righty){
                    ans.add(arr[h]);
                    h++;
                    k--;
                }else{
                    ans.add(arr[l]);
                    l--;
                    k--;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public int binSea(int[]arr,int x){
        int diff=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(x-arr[i])<diff){
                diff=Math.abs(x-arr[i]);
                idx=i;
            }
        }
        return idx;
    }
}