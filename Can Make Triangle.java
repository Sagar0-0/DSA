class Solution 
{ 
    int[] canMakeTriangle(int A[], int N) 
    { 
        // code here
        int[]ans=new int[N-2];
        for(int i=0;i<ans.length;i++){
            if(isTriangle(A[i],A[i+1],A[i+2])){
                ans[i]=1;
            }
        }
        return ans;
    }
    boolean isTriangle(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }
        return false;
    }
}
