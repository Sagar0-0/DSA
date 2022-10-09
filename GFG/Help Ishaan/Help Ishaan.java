class Solution
{
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        else if(n%2==0 || n%3==0){
            return false;
        }
        else{
            for(int i=5;i<=Math.sqrt(n);i+=6){
                if(n%(i)==0 || n%(i+2)==0){
                    return false;
                }
            }
            return true;
        }
        
    }
    public int NthTerm(int n)
    {
        if(isPrime(n)==true){
            return 0;
        }
        else{
          
            int diff=0;
            if(n-19<=0){
                diff=0;
            }
            else{
                diff=n-19;
            }
            int min=Integer.MAX_VALUE;
            for(int i=diff;i<(n+19);i++){
                if(isPrime(i)){
                    min=Integer.min((int)Math.abs(i-n),min);
                }
            }
            return min;
            
          
        }
    }
}


// A different code for the same solution

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
