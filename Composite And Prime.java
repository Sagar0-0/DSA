Without using DP



class Solution


{
    
    public boolean isPrime(int a){
        if(a==1){
            return false;
        }
        else if(a==2 || a==3){
            return true;
        }
        else if(a%2==0 || a%3==0){
            return false;
        }
        else{
            for(int i=5;i<=Math.sqrt(a);i+=6){
                if(a%i==0 || a%(i+2)==0){
                    return false;
                }
            }
            return true;
        }
    }
    public int Count(int l, int r)
    {
        
      
        long countp=0;
        long countc=0;
       for(int i=l;i<=r;i++){
           if(isPrime(i)==true){
               countp++;
           }
           else{
               countc++;
           }
       }
      
     
      
      int a=(int)(countc-countp);
      if(l==1 || r==1){
          a=a-1;
      }
      
      return a;
       
        
    }
}


//long to avoid integer overflow exception(if exists)

