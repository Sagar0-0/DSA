class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        long m=(long)1e9+7;
        long count=0;
        for(int i=0;i<N;i++){
            long num=A.get(i);
            if((num & num-1)==0){
               count++; 
            }
        }
        long ans=1;
        while(count!=0){
            ans=(ans*2)%m;
            count--;
        }
        return ans-1;
    }
    
}
