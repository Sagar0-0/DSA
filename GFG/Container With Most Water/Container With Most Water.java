
class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        long ans=0;
        int i=0;
        int j=len-1;
        while(i<j){
            ans=Math.max(ans,Math.min(A[i],A[j])*(j-i));
            if(A[i]<A[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
    
}
