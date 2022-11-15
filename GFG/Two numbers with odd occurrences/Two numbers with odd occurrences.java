class Solution
{
    public int[] twoOddNum(int arr[], int N)
    {
        // code here
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        int setBit=0;
        for(int i=0;i<32;i++){
            int curr= 1<<i;
            if((xor&curr)!=0){
                setBit=curr;
                break;
            }
        }
        int first=0;
        int second=0;
        for(int i=0;i<N;i++){
            if((arr[i]&setBit)!=0){
                first^=arr[i];
            }else{
                second^=arr[i];
            }
        }
        int[]ans=new int[2];
        if(first<second){
            ans[0]=second;
            ans[1]=first;
        }else{
            ans[0]=first;
            ans[1]=second;
        }
        return ans;
    }
}
