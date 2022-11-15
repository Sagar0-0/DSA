class solution{
  public:
long long int NoOfChicks(int n){
	    // Code here
	  long long int popn[36];
	  long long int brth[36];
	  
	  popn[0]=0;popn[1]=1;
	  brth[0]=0;brth[1]=1;
	  
	  for(int i=2;i<=6;i++){
	      brth[i]=2*(popn[i-1]-0);
	      popn[i]=brth[i]+popn[i-1];
	  }
	  
	  for(int i=7;i<=n;i++){
	      brth[i]=2*(popn[i-1]-brth[i-6]);
	      popn[i]=popn[i-1]+brth[i]-brth[i-6];
	  }
	  return popn[n];
	}
};
