
class Solution 
{
    public:
    //Function to find minimum number of pages.
    bool allocationPoss(int p,int M,int A[],int n){
        int stds = 0, pages = p;
        for(int i=0;i<n;i++){
            if(A[i]>p) return false;
            if(A[i]+pages>p){
                stds++;
                pages = A[i];
            }else pages+=A[i];
            
            if(stds>M) return false;
        }
        
        return true;
    }
    int findPages(int A[], int N, int M) 
    {
        if(M>N) return -1;
        int start = A[0],end = A[0];
        for(int i=1;i<N;i++){
            end+=A[i];
            start = max(start,A[i]);
        }
        int rs = -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(allocationPoss(mid,M,A,N)){
                rs = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return rs;
    }
};
