class Solution {
public:
	long long int NoOfChicks(int n){
	    // Code here
	    
	    vector<long long int> v(n); // hold's newly hatched chicks on ith day
       
       v[0]=1; 
       
       long long int sum=1;    // holds total chicks on given day
       
       for(int i=1; i<n; i++){
           if(i>=6) sum -= v[i-6];
           v[i] = 2*sum;
           sum += v[i];
               
       }
       
       return sum;
	}
};
