class Solution
{
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public int NthTerm(int n)
    {
        // code here
        int diff = 0;
        if(isPrime(n)){
            return diff;
        }
        while(true){
            if(isPrime(n+diff) || isPrime(n-diff)){
                break;
            }
            diff++;
        }
        return diff;
        
    }
}
