class Solution{
public:
	    bool isPrime(int num){
	        if(num <= 1) return false;
	        int cnt = 0;
	        for(int i = 2; i <= sqrt(num); i++){
	            if(num % i == 0) return false;
	        }
	        return true;
	    }
	
		int Count(int L, int R){
		    int p = 0, c = 0;
		    for(int i = L; i <= R; i++){
		        if(i == 1) continue;
		        if(isPrime(i)) p++;
		        else
		            c++;
		    }
		    return c - p;
		}
};
