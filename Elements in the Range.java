class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
        if(B-A>=n)return false;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i])>=A && Math.abs(arr[i])<=B){
                int ind=Math.abs(arr[i])-A;
                if(arr[ind]>0)arr[ind]*=-1;
            }
        }
        
        for(int i=0;i<=B-A;i++){
            if(arr[i]>0)return false;
        }
        return true;
        
    }
}
