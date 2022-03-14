class Solution {
   static int biGraph(int[] arr, int n, int e) {
       // code here
        if(n<=2) return 1;
        int p= 2* e;
        int freq[]= new int[n];
        for(int i=0;i<p;i+=2){
             freq[arr[i]]++;
             freq[arr[i+1]]++;
        }
        for(int num:freq)
            if(num<=1)return 0;
        return 1;
   }
};
