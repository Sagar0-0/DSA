class Solution { 
    int minSubset(int[] Arr,int N) { 
        if(N == 1) return 1;
        
        Arrays.sort(Arr);
        int start = 0; 
        int end = N-1;
        
        int count = 1;
        
        
        int sum = Arr[end];
        
        while(start < end) {
            if(Arr[start] < sum) {
                sum -= Arr[start++];
            } else {
                sum += Arr[--end];
                count++;
            }
        }
        
        return count;
    }
}
