class Solution { 
    int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        long sum=0;
        int count=1;
        for(int i=0;i<N;i++){
            sum+=Arr[N-1-i];
            if(sum> sumOf(Arr,0,N-i-2)){
                return count;
            }
            count++;
        }
        return 0;
    }
    
    long sumOf(int[] Arr ,int beg, int end){
        long sum=0;
        for(int i=beg;i<=end;i++){
            sum+=Arr[i];
        }
     return sum;
    }
}
