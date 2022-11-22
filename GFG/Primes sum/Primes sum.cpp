class Solution {
    public:
      bool checkPrime(int n)

    {

        if(n<2)

        return false;

        for(int i=2; i<=sqrt(n); i++)

        {

            if(n%i==0)

            return false;

        }

        return true;

    }
    
    string isSumOfTwo(int N){
        // code here
        
          for(int i=2; i<N; i++)

      {

          bool flag=true;

          if(!checkPrime(i))

          {

              flag=false;

          }

        if(flag==true)

        {

            if(checkPrime(N-i))

            return "Yes";

        }

      }

    return "No";
    }

};
