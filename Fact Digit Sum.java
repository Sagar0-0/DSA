class Solution
{
    ArrayList<Integer> FactDigit(int N)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int[]fact=new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++){
            fact[i]=i*fact[i-1];
        }
        
        for(int i=9;i>=1;i--){
            while(N>=fact[i]){
                N-=fact[i];
                ans.add(i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
