	public:
	bool isPrime(int x){

         if(x==1)return false;

         if(x==2||x==3)

          return true;

         if(x%2==0||x%3==0)

          return false;

         for(int i=5;i*i<=x;i+=6){

             if(x%i==0||x%(i+2)==0)

               return false;

         }

       return true;

     }
		int NthTerm(int N){
		    // Code here
		    if(isPrime(N))

     return 0;

    int n1,n2;

    n1=N-1,n2=N+1;

    while(n1>1 && isPrime(n1)==0)

     n1--;

    while(isPrime(n2)==0)

     n2++;

    

    return (n1>1)?min(N-n1,n2-N):(n2-N);  
		}

};
