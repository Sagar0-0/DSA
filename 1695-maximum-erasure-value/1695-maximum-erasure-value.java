class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int res = 0;
        boolean[] check = new boolean[10001];
        int l = 0;
        int r = 0;
        int temp=0;
        while(r<arr.length){
            if(check[arr[r]] == true){
                 res = Math.max(res, temp);
                 while (arr[l] != arr[r]) {
                     temp-=arr[l];
                     check[arr[l]] = false;
                     l++;
                 }
                 l++;
            }else{
                check[arr[r]] = true;
                temp+= arr[r];
            }
            r++;
            res = Math.max(res, temp);
        }
        return res;
    }
}