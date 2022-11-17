class Solution{

    static int nextHappy(int N){
        for(int i=N+1; i<=1005; i++)
        {
            ArrayList<Integer> ar=new ArrayList<Integer>();
            if(isHappyNumber(i, ar))
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean isHappyNumber(int n, ArrayList<Integer> ar)
    {
        if(ar.contains(n))
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        ar.add(n);
        n=findSquareNumber(n);
        boolean res=isHappyNumber(n, ar);
        return res;
    }
    public static int findSquareNumber(int n)
    {
        int newNumber=0;
        while(n>0)
        {
            int rem=n%10;
            newNumber+=(rem*rem);
            n=n/10;
        }
        return newNumber;
    }
}
