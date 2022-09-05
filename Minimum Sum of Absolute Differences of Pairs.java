class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long s=0;
        for(int i=0;i<N;i++){
            s=s+Math.abs(A[i]-B[i]);
        }
        return s;
    }
}
