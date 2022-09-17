 int minimumSwaps(int c[],int v[],int n,int k,int b,int T)
    {
            // code here
            int res=0, badSheep=0;
             for(int i=n-1;i>=0;i--){
              if (b-c[i]<=v[i]*T){
                k--;
                res +=badSheep;
               }
               else 
                badSheep++;
              if(k==0)
               return res;
           }
        return -1;
    }