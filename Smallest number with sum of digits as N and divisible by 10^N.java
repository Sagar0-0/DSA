class Solution
{
    public String digitsNum(int N)
    {
        // Code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append("0");
        }
        while(N!=0){
            if(N>9){
                sb.insert(0,9);
                N-=9;
            }else{
                sb.insert(0,N);
                N-=N;
            }
        }
        return sb.toString();
    }
}
