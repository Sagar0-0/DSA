//User function Template for Java
class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here
        int i=2;
        while(i<=32){
            int digit=(int)(Math.log(n)/Math.log(i))+1;
            if(digit==m)return "Yes";
            i++;
        }
        return "No";
    }
}
