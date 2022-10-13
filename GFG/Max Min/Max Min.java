
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:A){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        return min+max;
    }
}
