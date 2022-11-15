class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int[]a=new int[]{1,2,5,10,20,50,100,200,500,2000};
        List<Integer> ans=new ArrayList<>();
        int i=9;
        while(i>=0){
            if(a[i]>N){
                i--;
            }else{
                while(N>=a[i]){
                    ans.add(a[i]);
                    N-=a[i];
                }
            }
        }
        return ans;
    }
}
